SUMMARY = "GTK+3 timezone map widget - Introspection bindings"
DESCRIPTION = "This package contains the GObject Introspection bindings for \
timezonemap library."
LICENSE = "GPL-3.0-only"

PV = "0.4.4"

RPM_NAME = "typelib-1_0-TimezoneMap-1_0-0.4.4-2.9.aarch64.rpm"
RPM_HASH = "8ea4fb2234c96bd44ff0f0a3b3627c2a48e2f29fef9d7b133687cf32511a4b01c706218df133c01b243257d66e3e90a9318397ca4f51182fe1eec81a03983e19"

RPROVIDES:${PN} += "typelib(TimezoneMap) typelib-1_0-TimezoneMap-1_0 typelib-1_0-TimezoneMap-1_0(aarch-64)"
RDEPENDS:${PN} += "libtimezonemap.so.1()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Json) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
