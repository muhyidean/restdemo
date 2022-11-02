package miu.edu.restdemo.repo;

import miu.edu.restdemo.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Integer> {
}
