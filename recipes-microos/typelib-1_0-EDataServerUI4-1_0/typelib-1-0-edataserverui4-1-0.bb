SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-EDataServerUI4-1_0-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "a01546892c1c1bca57f2efd5820880827a0167232434052a6ce8805e682e591da0951c9fc44a0d069d4c5417bf5f6bfdce7ba39637bf98f9153449586fe6bcf0"

RPROVIDES:${PN} += "typelib(EDataServerUI4) \
typelib-1_0-EDataServerUI4-1_0 \
typelib-1_0-EDataServerUI4-1_0(aarch-64)"
RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedataserverui4-1.0.so.0()(64bit) \
typelib(Camel) \
typelib(ECal) \
typelib(EDataServer) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(ICalGLib) \
typelib(Json) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(Soup) \
typelib(cairo) \
typelib(freetype2) \
typelib(libxml2)"

inherit rpm
