SUMMARY = "Introspection bindings for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolord library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "typelib-1_0-Colord-1_0-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "b92f63b285caeed74807a478be9df705f8c02814d64865e6d698d03d76d2aff83f5bb2dc8e7463a2bc82910551f2f6396ea876d6856d9b82adbd83667d179353"

RPROVIDES:${PN} += "typelib(Colord) \
typelib-1_0-Colord-1_0 \
typelib-1_0-Colord-1_0(aarch-64)"
RDEPENDS:${PN} += "libcolord.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
