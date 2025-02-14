package dk.sdu.se_f22.sortingmodule.scoring;

import java.util.List;

public interface IScoring {

    /**
    <p> Returns weight value sum for multiple categories </p>
    */
    List<Object> scoreSort(List<Object> input);

    /**
    <p> Returns weight value for price </p>
     * @return
     */
    List<Object> scoreSortPrice(List<Object> input);

    /**
    <p> Returns weight value for review </p>
    */
    List<Object> scoreSortReview(List<Object> input);

    /**
    <p> Returns weight value for stock </p>
    */
    List<Object> scoreSortStock(List<Object> input);

    /**
    <p> Returns weight value for release date </p>
    */
    List<Object> scoreSortReleaseDate(List<Object> input);

    /**
    <p> ??? </p>
    */
    void update();
}
