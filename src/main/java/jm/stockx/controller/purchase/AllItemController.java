package jm.stockx.controller.purchase;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jm.stockx.components.purchase.TestPurshase;
import org.springframework.beans.factory.annotation.Autowired;


@Route("purchas")
public class AllItemController extends VerticalLayout {


    private final TestPurshase productPage;
    @Autowired
    public AllItemController(TestPurshase productPage) {
        this.productPage = productPage;
        add(productPage);

    }

}