SUMMARY = "MATE Desktop graphics viewer typelib"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "typelib-1_0-Eom-1_0-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "1a26ea45b0d13104d253860c20503303810791cf2ef3f902613d03add4570c924211149c2fb2ff4f094059c9e8d4451c6b99067d79b2d6c6763d3137b31b3254"

RPROVIDES:${PN} += "typelib(Eom) typelib-1_0-Eom-1_0 typelib-1_0-Eom-1_0(aarch-64)"
RDEPENDS:${PN} += "typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
