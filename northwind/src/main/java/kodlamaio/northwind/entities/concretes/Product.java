package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity					 // --> veritabanı nesnesi oldugunu belirler
@Table(name="products")  // --> veri tabanında neye karsılık geldiğini gosterir
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id //id alanının hangisi oldugu belirtilir
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // id'nin nasıl artırılacagını belirtir,manuel,otomatik
	@Column(name="product_id") // --> hang kolona karsılık geliyor
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
}
