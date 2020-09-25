package com.projet.arrisparis;

import com.projet.arrisparis.model.PanierInfo;

import javax.servlet.http.HttpServletRequest;

public class Utils {

    // Products in the cart, stored in Session.
    public static PanierInfo getCartInSession(HttpServletRequest request) {

        PanierInfo panierInfo = (PanierInfo) request.getSession().getAttribute("myCart");


        if (panierInfo == null) {
            panierInfo = new PanierInfo();

            request.getSession().setAttribute("myCart", panierInfo);
        }

        return panierInfo;
    }

    public static void removeCartInSession(HttpServletRequest request) {
        request.getSession().removeAttribute("myCart");
    }

    public static void storeLastOrderedCartInSession(HttpServletRequest request, PanierInfo cartInfo) {
        request.getSession().setAttribute("lastOrderedCart", cartInfo);
    }

    public static PanierInfo getLastOrderedCartInSession(HttpServletRequest request) {
        return (PanierInfo) request.getSession().getAttribute("lastOrderedCart");
    }

}
