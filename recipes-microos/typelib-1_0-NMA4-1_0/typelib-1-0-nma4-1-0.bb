SUMMARY = "Introspection bindings for libnma"
DESCRIPTION = "Introspection bindings for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "typelib-1_0-NMA4-1_0-1.10.6-1.3.aarch64.rpm"
RPM_HASH = "967d63c517a3fd0302c1e5ac55d9ee38a80aa55ffe9e966431dfde1680f2e12bc63015252a0ca270c9bf2a5162547543f9f9f20d23051f378a524b31221636e3"

RPROVIDES:${PN} += "typelib(NMA4) typelib-1_0-NMA4-1_0 typelib-1_0-NMA4-1_0(aarch-64)"
RDEPENDS:${PN} += "libnma-gtk4.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Graphene) typelib(Gsk) typelib(Gtk) typelib(HarfBuzz) typelib(NM) typelib(Pango) typelib(PangoCairo) typelib(cairo) typelib(freetype2)"

inherit rpm
