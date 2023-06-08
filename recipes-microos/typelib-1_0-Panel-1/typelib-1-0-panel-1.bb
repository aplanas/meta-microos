SUMMARY = "Typelib files for libpanel"
DESCRIPTION = "Package contains typelib files for use with libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "typelib-1_0-Panel-1-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "6f6a1ed4dcf1ff67e26a67068a89c58d992ea7350132e8339e7855a4f19bc5afd054b575f79feaa0bf4a64947a6805742e25a54ebafa7af60dea454844f31018"

RPROVIDES:${PN} += "typelib(Panel) typelib-1_0-Panel-1 typelib-1_0-Panel-1(aarch-64)"
RDEPENDS:${PN} += "libpanel-1.so.1()(64bit) typelib(Adw) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Graphene) typelib(Gsk) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(PangoCairo) typelib(cairo) typelib(freetype2)"

inherit rpm
