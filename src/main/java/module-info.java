module org.sqlite.sqlite.jdbc {
    requires java.logging;
    requires java.sql;
    //requires org.slf4j;  //deleted this

    exports org.sqlite;
    exports org.sqlite.core;
    exports org.sqlite.date;
    exports org.sqlite.javax;
    exports org.sqlite.jdbc3;
    exports org.sqlite.jdbc4;
    exports org.sqlite.util;

}


