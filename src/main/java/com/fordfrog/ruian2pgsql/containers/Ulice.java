/**
 * Copyright 2012 Miroslav Šulc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.fordfrog.ruian2pgsql.containers;

import java.util.Date;

/**
 * Container for Ulice information.
 *
 * @author fordfrog
 */
public class Ulice implements ItemWithDefinicniCara, ItemWithNespravneUdaje {

    private Integer kod;
    private String nazev;
    private Boolean nespravny;
    private Integer obecKod;
    private Long idTransRuian;
    private Date platiOd;
    private Long nzIdGlobalni;
    private Boolean zmenaGrafiky;
    private String definicniCara;
    private String nazevUdaje;
    private Date oznacenoDne;
    private String oznacenoInfo;

    public Integer getKod() {
        return kod;
    }

    public void setKod(final Integer kod) {
        this.kod = kod;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(final String nazev) {
        this.nazev = nazev;
    }

    public Boolean getNespravny() {
        return nespravny;
    }

    public void setNespravny(final Boolean nespravny) {
        this.nespravny = nespravny;
    }

    public Integer getObecKod() {
        return obecKod;
    }

    public void setObecKod(final Integer obecKod) {
        this.obecKod = obecKod;
    }

    public Long getIdTransRuian() {
        return idTransRuian;
    }

    public void setIdTransRuian(final Long idTransRuian) {
        this.idTransRuian = idTransRuian;
    }

    @SuppressWarnings("ReturnOfDateField")
    public Date getPlatiOd() {
        return platiOd;
    }

    @SuppressWarnings("AssignmentToDateFieldFromParameter")
    public void setPlatiOd(final Date platiOd) {
        this.platiOd = platiOd;
    }

    public Long getNzIdGlobalni() {
        return nzIdGlobalni;
    }

    public void setNzIdGlobalni(final Long nzIdGlobalni) {
        this.nzIdGlobalni = nzIdGlobalni;
    }

    public Boolean getZmenaGrafiky() {
        return zmenaGrafiky;
    }

    public void setZmenaGrafiky(final Boolean zmenaGrafiky) {
        this.zmenaGrafiky = zmenaGrafiky;
    }

    @Override
    public String getDefinicniCara() {
        return definicniCara;
    }

    @Override
    public void setDefinicniCara(final String definicniCara) {
        this.definicniCara = definicniCara;
    }

    @Override
    public String getNazevUdaje() {
        return nazevUdaje;
    }

    public void setNazevUdaje(String nazevUdaje) {
        this.nazevUdaje = nazevUdaje;
    }

    @Override
    public Date getOznacenoDne() {
        return oznacenoDne;
    }

    public void setOznacenoDne(Date oznacenoDne) {
        this.oznacenoDne = oznacenoDne;
    }

    @Override
    public String getOznacenoInfo() {
        return oznacenoInfo;
    }

    public void setOznacenoInfo(String oznacenoInfo) {
        this.oznacenoInfo = oznacenoInfo;
    }
}
