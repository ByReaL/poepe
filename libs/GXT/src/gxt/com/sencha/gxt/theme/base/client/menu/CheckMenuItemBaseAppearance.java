/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright (c) 2006-2015, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Open Source License
 * ================================================================================
 * This version of Sencha GXT is licensed under the terms of the Open Source GPL v3
 * license. You may use this license only if you are prepared to distribute and
 * share the source code of your application under the GPL v3 license:
 * http://www.gnu.org/licenses/gpl.html
 *
 * If you are NOT prepared to distribute and share the source code of your
 * application under the GPL v3 license, other commercial and oem licenses
 * are available for an alternate download of Sencha GXT.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.theme.base.client.menu;

import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.widget.core.client.menu.CheckMenuItem.CheckMenuItemAppearance;

public abstract class CheckMenuItemBaseAppearance extends MenuItemBaseAppearance implements CheckMenuItemAppearance {

  public interface CheckMenuItemResources extends MenuItemResources {

    CheckMenuItemStyle checkStyle();
    
    ImageResource checked();
    
    ImageResource unchecked();
    
    ImageResource groupChecked();

  }

  public interface CheckMenuItemStyle extends CssResource {

    String menuItemChecked();

  }

  private final CheckMenuItemResources resources;
  private final CheckMenuItemStyle checkStyle;

  public CheckMenuItemBaseAppearance(CheckMenuItemResources resources, MenuItemTemplate template) {
    super(resources, template);
    this.resources = resources;
    checkStyle = resources.checkStyle();
  }

  @Override
  public void applyChecked(XElement parent, boolean state) {
    parent.setClassName(checkStyle.menuItemChecked(), state);
  }

  @Override
  public XElement getCheckIcon(XElement parent) {
    return parent.<XElement>cast().selectNode("." + resources.style().menuItemIcon());
  }

  @Override
  public ImageResource checked() {
    return resources.checked();
  }

  @Override
  public ImageResource unchecked() {
    return resources.unchecked();
  }

  @Override
  public ImageResource radio() {
    return resources.groupChecked();
  }

}
