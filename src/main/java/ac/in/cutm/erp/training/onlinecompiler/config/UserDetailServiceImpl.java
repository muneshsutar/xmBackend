package ac.in.cutm.erp.training.onlinecompiler.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import ac.in.cutm.erp.training.onlinecompiler.entities.Login;
import ac.in.cutm.erp.training.onlinecompiler.repository.UserRepository;

public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Login user = userRepository.getUserByUsername(username);
		if(user== null) {
			throw new UsernameNotFoundException("the user does not exist");
		}
		Customuserdetails userdetails=new Customuserdetails(user);
		return userdetails;
	}

}
