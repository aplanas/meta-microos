SUMMARY = "MATE Desktop graphics viewer typelib"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-Eom-1_0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "19ddc1149df34decd1eafd2fdfe024ab703144d14e3b6e10d2a0f1f217c6ac8d4e59507a9c2e089d2033a162d62fb22790d644fc6ef7d0d99778d5e5b4a40017"

RPROVIDES:${PN} += "typelib(Eom) typelib-1_0-Eom-1_0 typelib-1_0-Eom-1_0(aarch-64)"
RDEPENDS:${PN} += "typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
