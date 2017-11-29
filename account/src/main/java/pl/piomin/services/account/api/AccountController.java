package pl.piomin.services.account.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.services.account.model.Account;

@RestController
public class AccountController {

	@GetMapping("/")
	@PreAuthorize("#oauth2.hasScope('read')")
	public Account findAccount() {
		return new Account(1, 1, "123456789", 1234);
	}
	
}
