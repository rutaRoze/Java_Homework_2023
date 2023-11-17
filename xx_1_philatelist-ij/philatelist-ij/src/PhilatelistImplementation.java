import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhilatelistImplementation implements Philatelist {

    ArrayList<PostStamp> postStamps = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (!postStamps.contains(postStamp)) {
            postStamps.add(postStamp);
        }
    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {

        PostStamp mostExpensive = postStamps.get(0);

        for (PostStamp postStamp : postStamps) {
            if (postStamp.getMarketPrice() > mostExpensive.getMarketPrice()) {
                mostExpensive = postStamp;
            }
        }
        return mostExpensive;

        //return postStamps.stream().max(Comparator.comparing(PostStamp::getMarketPrice)).orElse(null);
    }

    @Override
    public double getAveragePostStampPrice() {

        double sum = 0;
        for (PostStamp postStamp : postStamps) {
            sum += postStamp.getMarketPrice();
        }

        return sum / postStamps.size();
        //return postStamps.stream().mapToDouble((PostStamp::getMarketPrice)).average().orElseThrow();
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return postStamps.size();
    }
}
