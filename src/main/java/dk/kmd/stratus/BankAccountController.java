package dk.kmd.stratus;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bankaccounts")
public class BankAccountController {
    

    @PutMapping("/{bankAccountId}")
    public String updateBankAccount(@PathVariable(value = "bankAccountId") Long bankAccountId, @Validated @RequestBody String reqBody)  {
    	return "bankAccountId "+bankAccountId +" reqBody";
    }

    @GetMapping()
    //Get All Bank Accounts
    public String getAllBankAccounts() {
        return "ALL";
    }

}
