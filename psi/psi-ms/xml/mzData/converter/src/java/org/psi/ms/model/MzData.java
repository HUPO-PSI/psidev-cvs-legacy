/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * The "peak list" is really processed data from an experiment.
 * There can bemultiple acquisitions, which might be related via a
 * separation, or just in sequence from an automated run.
 *
 * @version $Revision$ $Date$
 */
public class MzData implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _version
     */
    private java.lang.String _version = "1.00";

    /**
     * Each data set starts with a description section. Each
     * acquisition given in the 'raw' section has an entry in the
     * description section. This allows the desc section to be read
     * and then used to find specific entries in the raw section.
     */
    private org.psi.ms.model.Desc _desc;

    /**
     * List of acquisitions.
     * This is the actual peak list data. All that is stored here
     * is the actual data, all descriptive information is in the
     * desc section.
     */
    private org.psi.ms.model.AcquisitionList _acquisitionList;



    //----------------/
    //- Constructors -/
    //----------------/

    public MzData() {
        super();
    } //-- org.psi.ms.model.MzData()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'desc'. The field 'desc' has the
     * following description: Each data set starts with a
     * description section. Each acquisition given in the 'raw'
     * section has an entry in the description section. This allows
     * the desc section to be read and then used to find specific
     * entries in the raw section.
     *
     * @return the value of field 'desc'.
     */
    public org.psi.ms.model.Desc getDesc() {
        if (_desc == null)
            _desc = new Desc();
        return this._desc;
    } //-- org.psi.ms.model.Desc getDesc()

    /**
     * Returns the value of field 'acquisitionList'. The field
     * 'acquisitionList' has the following description: List of
     * acquisitions.
     *
     * @return the value of field 'acquisitionList'.
     */
    public org.psi.ms.model.AcquisitionList getAcquisitionList() {
        if (_acquisitionList == null)
            _acquisitionList = new AcquisitionList();
        return this._acquisitionList;
    } //-- org.psi.ms.model.AcquisitionList getAcquisitionList()

    /**
     * Returns the value of field 'version'.
     *
     * @return the value of field 'version'.
     */
    public java.lang.String getVersion() {
        return this._version;
    } //-- java.lang.String getVersion()

    /**
     * Sets the value of field 'desc'. The field 'desc' has the
     * following description: Each data set starts with a
     * description section. Each acquisition given in the 'raw'
     * section has an entry in the description section. This allows
     * the desc section to be read and then used to find specific
     * entries in the raw section.
     *
     * @param desc the value of field 'desc'.
     */
    public void setDesc(org.psi.ms.model.Desc desc) {
        this._desc = desc;
    } //-- void setDesc(org.psi.ms.model.Desc)

    /**
     * Sets the value of field 'acquisitionList'. The field
     * 'acquisitionList' has the following description: List of
     * acquisitions.
     *
     * @param acquisitionList the value of field 'acquisitionList'.
     */
    public void setAcquisitionList(org.psi.ms.model.AcquisitionList acquisitionList) {
        this._acquisitionList = acquisitionList;
    } //-- void setAcquisitionList(org.psi.ms.model.AcquisitionList)

    /**
     * Sets the value of field 'version'.
     *
     * @param version the value of field 'version'.
     */
    public void setVersion(java.lang.String version) {
        this._version = version;
    } //-- void setVersion(java.lang.String)

}
