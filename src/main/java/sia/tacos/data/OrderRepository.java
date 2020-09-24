package sia.tacos.data;

import org.springframework.data.repository.CrudRepository;
import sia.tacos.Order;
import sia.tacos.User;

import java.util.List;


public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByUserOrderByPlacedAtDesc(User user);
}
