import java.util.ArrayList;

public class ProductReview
{
    private String name;
    private String review;

    public ProductReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }
}


public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        String pNamePassed = prodReview.getName();
        boolean isPresent = false;
        for(int i=0; i < productList.size(); i++) {
            if (productList.get(i).equals(pNamePassed)) {
                isPresent = true;
                break;
            }
        }
        if(!isPresent) {
            productList.add(pNamePassed);
        }
    }

    public int getNumGoodReviews(String prodName) {
        int ctr = 0;
        for(int i=0; i < reviewList.size(); i++) {
            if(reviewList.get(i).getName().equals(prodName)) {
                String rev = reviewList.get(i).getReview();
                int val = rev.indexOf("best");
                if(val != -1) {
                    ctr++;
                }
            }
        }
        return ctr;
    }
}


/* c) To the getNumGoodReviews method:

        public void getBestReviewsByProduct() {}
        A new array list of best reviews will have to be created
        and, as soon as the word best is found, by using the technique described in getNumGoodReviews
        it should be added to the new arraylist


 */