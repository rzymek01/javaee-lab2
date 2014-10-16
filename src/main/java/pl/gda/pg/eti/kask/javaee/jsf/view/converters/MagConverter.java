package pl.gda.pg.eti.kask.javaee.jsf.view.converters;

import pl.gda.pg.eti.kask.javaee.jsf.WiezaService;
import pl.gda.pg.eti.kask.javaee.jsf.entities.Mag;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author psysiu
 */
@ManagedBean
@RequestScoped
public class MagConverter implements Converter {

    @ManagedProperty("#{wiezaService}")
    private WiezaService wiezaService;

    public void setWiezaService(WiezaService wiezaService) {
        this.wiezaService = wiezaService;
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if ("---".equals(value)) {
            return null;
        }
        return wiezaService.findMag(Integer.parseInt(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return "---";
        }
        return ((Mag) value).getId() + "";
    }
}
