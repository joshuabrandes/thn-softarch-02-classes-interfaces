package ohm.softa.a02;

import lombok.Data;
import lombok.Getter;

import java.util.Iterator;
import java.util.NoSuchElementException;

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

        @Getter
        private Element current;

        public SimpleIteratorImpl() {
            // Initialisiere current mit dem Kopf der Liste
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Element next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Element result = current;
            current = current.next;
            return result;
        }
    }


}
