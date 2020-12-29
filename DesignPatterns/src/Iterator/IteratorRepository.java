package Iterator;

public class IteratorRepository implements Section {

    @Override
    public Iterator getIterator(String[] models) {
        return new ModelIterator(models);
    }

    private class ModelIterator implements Iterator {
        int index;
        private String[] models;

        ModelIterator(String [] models){
            this.models = models;
        }

        @Override
        public boolean hasNext() {
            if(index < models.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return models[index++];
            }
            return null;
        }
    }
}
