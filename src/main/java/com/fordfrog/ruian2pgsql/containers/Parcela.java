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
 * Container for Parcela information.
 *
 * @author fordfrog
 */
public class Parcela implements ItemWithDefinicniBod, ItemWithHranice, ItemWithNespravneUdaje {

    private Long id;
    private Boolean nespravny;
    private Integer katuzKod;
    private Integer druhPozemkuKod;
    private Integer druhCislovaniKod;
    private Integer kmenoveCislo;
    private Integer poddeleniCisla;
    private Long vymeraParcely;
    private Long idTransRuian;
    private Integer zpusobVyuPozKod;
    private Long rizeniId;
    private Date platiOd;
    private String definicniBod;
    private String hranice;
    private String nazevUdaje;
    private Date oznacenoDne;
    private String oznacenoInfo;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Boolean getNespravny() {
        return nespravny;
    }

    public void setNespravny(final Boolean nespravny) {
        this.nespravny = nespravny;
    }

    public Integer getKatuzKod() {
        return katuzKod;
    }

    public void setKatuzKod(final Integer katuzKod) {
        this.katuzKod = katuzKod;
    }

    public Integer getDruhPozemkuKod() {
        return druhPozemkuKod;
    }

    public void setDruhPozemkuKod(final Integer druhPozemkuKod) {
        this.druhPozemkuKod = druhPozemkuKod;
    }

    public Integer getDruhCislovaniKod() {
        return druhCislovaniKod;
    }

    public void setDruhCislovaniKod(final Integer druhCislovaniKod) {
        this.druhCislovaniKod = druhCislovaniKod;
    }

    public Integer getKmenoveCislo() {
        return kmenoveCislo;
    }

    public void setKmenoveCislo(final Integer kmenoveCislo) {
        this.kmenoveCislo = kmenoveCislo;
    }

    public Integer getPoddeleniCisla() {
        return poddeleniCisla;
    }

    public void setPoddeleniCisla(final Integer poddeleniCisla) {
        this.poddeleniCisla = poddeleniCisla;
    }

    public Long getVymeraParcely() {
        return vymeraParcely;
    }

    public void setVymeraParcely(final Long vymeraParcely) {
        this.vymeraParcely = vymeraParcely;
    }

    public Long getIdTransRuian() {
        return idTransRuian;
    }

    public void setIdTransRuian(final Long idTransRuian) {
        this.idTransRuian = idTransRuian;
    }

    public Integer getZpusobVyuPozKod() {
        return zpusobVyuPozKod;
    }

    public void setZpusobVyuPozKod(final Integer zpusobVyuPozKod) {
        this.zpusobVyuPozKod = zpusobVyuPozKod;
    }

    public Long getRizeniId() {
        return rizeniId;
    }

    public void setRizeniId(final Long rizeniId) {
        this.rizeniId = rizeniId;
    }

    @SuppressWarnings("ReturnOfDateField")
    public Date getPlatiOd() {
        return platiOd;
    }

    @SuppressWarnings("AssignmentToDateFieldFromParameter")
    public void setPlatiOd(final Date platiOd) {
        this.platiOd = platiOd;
    }

    @Override
    public String getDefinicniBod() {
        return definicniBod;
    }

    @Override
    public void setDefinicniBod(final String definicniBod) {
        this.definicniBod = definicniBod;
    }

    @Override
    public String getHranice() {
        return hranice;
    }

    @Override
    public void setHranice(final String hranice) {
        this.hranice = hranice;
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
