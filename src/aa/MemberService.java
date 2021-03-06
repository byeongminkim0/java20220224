package aa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.market.domain.AddressDto;
import com.project.market.domain.MemberDto;
import com.project.market.domain.ProductDto;
import com.project.market.mapper.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper mapper;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public boolean addMember(MemberDto member) {

		// 평문암호를 암호화(encoding)
		String encodedPassword = passwordEncoder.encode(member.getPassword());

		// 암호화된 암호를 다시 세팅
		member.setPassword(encodedPassword);

		// insert member
		int cnt1 = mapper.insertMember(member);

		// insert auth
		int cnt2 = mapper.insertAuth(member.getId(), "ROLE_USER");

		return cnt1 == 1 && cnt2 == 1;

	}

	public boolean hasMemberId(String id) {
		return mapper.countMemberId(id) > 0;
	}

	public boolean hasMemberEmail(String email) {
		return mapper.countMemberEmail(email) > 0;
	}

	public boolean hasMemberNickName(String nickName) {
		return mapper.countMemberNickName(nickName) > 0;
	}

	public MemberDto getMemberById(String id) {
		// TODO Auto-generated method stub
		return mapper.selectMemberById(id);
	}

	@Transactional
	public boolean removeMember(MemberDto dto) {
		MemberDto member = mapper.selectMemberById(dto.getId());

		String rawPW = dto.getPassword();
		String encodedPW = member.getPassword();

		if (passwordEncoder.matches(rawPW, encodedPW)) {

			// 권한테이블 삭제
			mapper.deleteAuthById(dto.getId());

			// 멤버테이블 삭제
			int cnt = mapper.deleteMemberById(dto.getId());

			return cnt == 1;
		}

		return false;
	}

	public boolean modifyMember(MemberDto dto, String oldPassword) {
		// db에서 member 읽어서
		MemberDto oldMember = mapper.selectMemberById(dto.getId());

		String encodedPW = oldMember.getPassword();

		// 기존password가 일치할 때만 계속 진행
		if (passwordEncoder.matches(oldPassword, encodedPW)) {

			// 암호 인코딩
			dto.setPassword(passwordEncoder.encode(dto.getPassword()));

			return mapper.updateMember(dto) == 1;
		}

		return false;
	}

	public boolean hasMemberId(String id) {
		return mapper.countMemberId(id) > 0;
	}

	public boolean hasMemberEmail(String email) {
		return mapper.countMemberEmail(email) > 0;
	}

	public boolean hasMemberNickName(String nickName) {
		return mapper.countMemberNickName(nickName) > 0;
	}

	public boolean setAddress(MemberDto dto) {

		return mapper.updateAddress(dto.getId(), dto) == 1;

	}

	public void initPassword(String id) {

		String pw = passwordEncoder.encode(id);
		mapper.updatePasswordById(id, pw);
	}

	public List<MemberDto> listMember() {

		return mapper.selectAllMember();
	}
	
	public List<ProductDto> Productlist() {
		return mapper.getProductlist();
	}

	public List<AddressDto> listAddress() {
		
		return mapper.selectAllAddress();
	}

	public void updateOneAddress(String id, String address) {
		mapper.updateOneAddress(id, address);
	}

	public void removeAddress(String address) {
		mapper.removeAddress(address);
	}

	public boolean hasAddress(String address) {
		return mapper.countAddress(address) > 0;
	}

}
