SUMMARY = "On-screen Keyboard for GNOME -- Introspection bindings"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device. \
 \
This package provides the GObject Introspection bindings for the caribou \
library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "typelib-1_0-Caribou-1_0-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "89637463170894d02414bb196e7a44329d6114e37e0e654a0bad2fe2f469272669980566ea80d66d081c52ede34f78fdbe2f728e608ebb597bb9a69a58aa90db"

RPROVIDES:${PN} += "typelib(Caribou) typelib-1_0-Caribou-1_0 typelib-1_0-Caribou-1_0(aarch-64)"
RDEPENDS:${PN} += "libcaribou.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2)"

inherit rpm
