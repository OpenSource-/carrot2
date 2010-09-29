package org.carrot2.util.attribute.metadata;

import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;

/**
 * Information about a nested bindable field.
 */
public class BindableFieldInfo
{
    /**
     * The nested bindable field declaration.
     */
    private final VariableElement field;
    
    /**
     * {@link #field}'s declared {@Bindable} type.
     */
    private final Element element;
    
    private final String descriptorClass;    

    public BindableFieldInfo(VariableElement field, Element element, String descriptorClass)
    {
        this.field = field;
        this.element = element;
        this.descriptorClass = descriptorClass;
    }
    
    public VariableElement getField()
    {
        return field;
    }
    
    public Element getFieldElement()
    {
        return element;
    }
    
    public String getDescriptorClass()
    {
        return descriptorClass;
    }
}
