package example;

import WebServices.Auction;
import WebServices.AuctionService;

public class AuctionClient
{
  public static void main(String[] argv) {
    Auction service = new AuctionService().getPort(Auction.class);
    //invoke business method
//
//
//
//    service.offerItem();
  }
}
