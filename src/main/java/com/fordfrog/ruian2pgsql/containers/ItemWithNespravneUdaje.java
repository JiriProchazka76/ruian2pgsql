package com.fordfrog.ruian2pgsql.containers;

import java.util.Date;

public interface ItemWithNespravneUdaje {

    String getNazevUdaje();

    Date getOznacenoDne();

    String getOznacenoInfo();

    void setNazevUdaje(String nazevUdaje);

    void setOznacenoDne(Date oznacenoDne);

    void setOznacenoInfo(String oznacenoInfo);
}
