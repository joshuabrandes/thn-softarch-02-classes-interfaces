package ohm.softa.a02;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
@Data
public class SimpleListImpl implements SimpleList {

    Element head = null;

	// TODO: Implement the required methods.

    private static class Element {
        Object item;
        Element next;
    }

    class SimpleIteratorImpl implements Iterator<Element> {

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Element next() {
            return ;
        }
    }

}
