/** @author Erim Serdonmez -
 *  ScrapBook.java -- ScrapBook for Classes
 * Can be used if one wants to try the code from .md Files
 */
package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainScrapBook {
    public static void main(String[] args) {
      String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla elementum metus ut dui placerat, at ultricies dui scelerisque. Aenean cursus nunc non lacus fermentum, sed consequat urna gravida. Duis a elementum ligula, non scelerisque urna. Fusce vel lectus pharetra, sollicitudin sapien vitae, vehicula neque. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sit amet diam rutrum, dapibus ligula ac, tincidunt dolor. Aenean elementum varius nunc, in porta tellus tempor vitae. Duis accumsan fringilla libero, non laoreet arcu. Nullam blandit dolor sit amet sapien facilisis scelerisque. Nam rhoncus, tortor eget faucibus bibendum, erat sapien ornare nisi, quis malesuada nunc ex vel magna. Suspendisse justo diam, luctus sit amet auctor sed, dignissim eget ipsum. Etiam vestibulum augue eu tortor dictum, ac rhoncus leo facilisis. In maximus dui sed interdum porta. Vestibulum ut orci quis arcu bibendum commodo.Ut ipsum nulla, scelerisque ut mollis id, rutrum at felis. Vestibulum tincidunt porttitor tortor ut pharetra. Sed consequat eros dui, vel bibendum mi maximus at. Maecenas convallis convallis felis. Etiam dictum libero nulla, semper faucibus massa facilisis in. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eu nunc sit amet dolor pretium semper. Etiam ut facilisis metus. Curabitur commodo tortor auctor condimentum ultricies. Duis pulvinar purus quis pellentesque iaculis.Suspendisse non posuere lorem. Maecenas eu neque magna. Maecenas pulvinar lorem ac pharetra cursus. Suspendisse aliquam velit ut accumsan ultricies. Morbi semper urna lectus, non suscipit tellus imperdiet vel. Suspendisse quis tincidunt dolor, id accumsan nisi. Suspendisse vehicula elit.";
      str = str.toLowerCase();
      String arr[] = str.split(" ");
      List<String> list = Arrays.asList(arr);
      Stream<String> stream = list.stream().filter(it -> it.contains("c"));
      stream.forEach(System.out::println);
      
    }
}
