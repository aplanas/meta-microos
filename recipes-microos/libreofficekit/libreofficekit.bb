SUMMARY = "A library providing access to LibreOffice functionality"
DESCRIPTION = "LibreOfficeKit can be used to access LibreOffice functionality \
through C/C++, without any need to use UNO."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreofficekit-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "4e6807c810f58408c32ecd8ed2fc31e3b6308856f9fe20d9b57991b08eea83f53b30639df2032a76c97b85c902d7e21b6ffae474715760aa0667b01130420bc5"

RPROVIDES:${PN} += "libreofficekit libreofficekit(aarch-64) typelib(LOKDocView)"
RDEPENDS:${PN} += "liblibreofficekitgtk.so()(64bit) libreoffice typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
