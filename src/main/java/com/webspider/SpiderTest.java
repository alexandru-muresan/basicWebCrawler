package com.worldpay.gateway.acquirersim.messages.apacs;


public class SpiderTest
{
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     *
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
        Spider spider = new Spider();
        spider.search("https://www.fanatec.com/eu-en/", "100% discount");//discount code
        //https://www.fanatec.com/eu-en/product/xboxone
        //https://www.fanatec.com/eu-en/product/ps4
        //https://www.fanatec.com/eu-en/product/multiplatform
    }
}
