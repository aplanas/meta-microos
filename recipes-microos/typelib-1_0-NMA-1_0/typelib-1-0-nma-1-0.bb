SUMMARY = "Introspection bindings for libnma"
DESCRIPTION = "Introspection bindings for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "typelib-1_0-NMA-1_0-1.10.6-1.3.aarch64.rpm"
RPM_HASH = "2fa2b276e61d39f0b948f883c4c6c0d6376c091f3768c57b5f65ea8e5048affd3702957082979cd22f6dc1241b933d213b17e2d8c6ca5485a3ca4b3efeefbe05"

RPROVIDES:${PN} += "typelib(NMA) typelib-1_0-NMA-1_0 typelib-1_0-NMA-1_0(aarch-64)"
RDEPENDS:${PN} += "libnma.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(NM) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
