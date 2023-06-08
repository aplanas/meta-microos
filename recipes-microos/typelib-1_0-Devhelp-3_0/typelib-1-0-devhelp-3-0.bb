SUMMARY = "Introspection bindings for the GNOME Developer Help program"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the gobject introspection based typelib library."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "typelib-1_0-Devhelp-3_0-43.0-2.1.aarch64.rpm"
RPM_HASH = "afc3fdd92ac2c1926049ea4760ffc92cafa3234db253009cebfdb45738dfa27498c30f39ab759f7144b04d1f95349c395ac1ecaee6f9880dfd436a64a31e7383"

RPROVIDES:${PN} += "typelib(Devhelp) typelib-1_0-Devhelp-3_0 typelib-1_0-Devhelp-3_0(aarch-64)"
RDEPENDS:${PN} += "libdevhelp-3.so.6()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(JavaScriptCore) typelib(Pango) typelib(Soup) typelib(WebKit2) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
