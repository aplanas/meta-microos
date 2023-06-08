SUMMARY = "Libcinnamon-desktop API -- Introspection bindings"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package provides the GObject Introspection bindings for \
libcinnamon-desktop."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.6.2"

RPM_NAME = "typelib-1_0-CinnamonDesktop-3_0-5.6.2-1.1.aarch64.rpm"
RPM_HASH = "a049a525dc54e66ba9da659a6fc49b6f101e4c99d3e05b632d0bfd5693c80364e7580e46b0a1feb9b5b1caa7a898c3317df7a0659a746795241d3ca6bb34d974"

RPROVIDES:${PN} += "typelib(CDesktopEnums) typelib(CinnamonDesktop) typelib-1_0-CinnamonDesktop-3_0 typelib-1_0-CinnamonDesktop-3_0(aarch-64)"
RDEPENDS:${PN} += "libcinnamon-desktop.so.4()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
