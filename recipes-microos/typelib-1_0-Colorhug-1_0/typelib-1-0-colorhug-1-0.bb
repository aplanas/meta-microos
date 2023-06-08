SUMMARY = "Introspection bindings for libcolorhug"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolorhug library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "typelib-1_0-Colorhug-1_0-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "a351b30bcbd6f445a68bce12f2fb0f09b9d55280eb2a523db3e8687ccbc6dcf9cbfb0c076436a1866cb0f4f538ceae243c18b9ac7274f5d1fcb3ff1eb3375f48"

RPROVIDES:${PN} += "typelib(Colorhug) typelib-1_0-Colorhug-1_0 typelib-1_0-Colorhug-1_0(aarch-64)"
RDEPENDS:${PN} += "libcolorhug.so.2()(64bit) typelib(Colord) typelib(GLib) typelib(GObject) typelib(GUsb) typelib(Gio)"

inherit rpm
