package in.shivu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shivu.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	

}
