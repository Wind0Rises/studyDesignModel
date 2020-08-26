package com.liu.study.design.model.behavior.responsibility.whole;

import com.liu.study.design.model.behavior.responsibility.whole.impl.WholeNewNumberFilter;
import com.liu.study.design.model.behavior.responsibility.whole.impl.WholeNumberFilter;
import com.liu.study.design.model.behavior.responsibility.whole.impl.WholeSpecialCharFilter;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 15:36
 */
public class WholeFilterDemo {

    public static void main(String[] args) {
        WholeFilterChain chain1 = new WholeFilterChain();
        chain1.addFilter(new WholeNumberFilter()).addFilter(new WholeSpecialCharFilter());

        WholeFilterChain chain2 = new WholeFilterChain();
        chain2.addFilter(new WholeNewNumberFilter());

        chain1.addFilter(chain2);

        Request request = new Request("this is 1 and 2 <se>");
        Response response = new Response("this issss 1 and 2 <se>");
        chain1.doFilter(request, response, chain1);
        System.out.println(request.getMessage());
        System.out.println(response.getMessage());
    }

}