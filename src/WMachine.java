import java.util.Arrays;

public class WMachine {
    double money = 0;
    double userMoney = 0;
    Product[] productList;

    public WMachine(int userMoney) {
        this.userMoney = userMoney;
        this.productList = new Product[10];
        for (int i = 0; i < this.productList.length; i++) {
            productList[i] = Product.generateProduct();
        }
    }

    @Override
    public String toString() {
        String res = "Бип-бип! Добро пожаловать в наш автомат!\n";
        for (int i = 1; i < this.productList.length + 1; i++) {
            res += i;
            res += " - " + this.productList[i - 1] + "\n";
        }
        return res;
    }

    public Product setProduct(int ind, Product product) {
        Product aproduct = this.productList[ind];
        this.productList[ind] = product;
        return aproduct;
    }

    public Product getProduct(int ind) {
        Product product = this.productList[ind];
        if (this.userMoney > product.getCost()) {
            this.productList[ind] = null;
            this.userMoney -= product.getCost();
            this.money += product.getCost();
            return product;
        } else {
            System.out.println("Недостаточно средств!");
            return null;
        }
    }
}
