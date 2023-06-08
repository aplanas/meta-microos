SUMMARY = "GNU Data Access (GDA) Library - UI Widgets -- Introspection bindings"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides the GObject Introspection bindings for \
libgda-ui."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "typelib-1_0-Gdaui-6_0-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "fe4e36f1adeaf2394491ee6fe5835783ba67956542e9ff29ee60ca143f5d51f90af6f57d38150b78af9b40b7cd1778e9a692f5597ab94a940c1c4ae6cba054e6"

RPROVIDES:${PN} += "typelib(Gdaui) typelib-1_0-Gdaui-6_0 typelib-1_0-Gdaui-6_0(aarch-64)"
RDEPENDS:${PN} += "libgda-ui-6.0.so.6.0.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gda) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(libxml2) typelib(xlib)"

inherit rpm
