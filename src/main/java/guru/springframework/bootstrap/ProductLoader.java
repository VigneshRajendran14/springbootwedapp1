package guru.springframework.bootstrap;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

		/*
		 * Product aari = new Product(); aari.setDescription("3mm bead");
		 * aari.setPrice(new BigDecimal("18.95")); aari.setQuantity(5);
		 * aari.setProductId("3mm Coil"); productRepository.save(aari);
		 * 
		 * log.info("Saved Material - id: " + aari.getId());
		 * 
		 * Product ned = new Product(); ned.setDescription("Needle");
		 * ned.setProductId("Aari Needle"); ned.setPrice(new BigDecimal("10.95"));
		 * productRepository.save(ned);
		 * 
		 * log.info("Saved Material - id:" + ned.getId());
		 */
    }
}
