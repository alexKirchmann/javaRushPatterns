package Wrapper;

import java.util.List;

public class Lct8_TableInterfaceWrapper {

    static class TableInterfaceWrapper implements TableInterface{
        private TableInterface tableInterface;

        public TableInterfaceWrapper (TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel (List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText (String newHeaderText){
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}