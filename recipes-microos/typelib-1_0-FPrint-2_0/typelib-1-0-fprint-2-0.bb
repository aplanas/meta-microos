SUMMARY = "Introspection bindings for libfprint"
DESCRIPTION = "This package contains the introspection bindings for the libfprint."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "typelib-1_0-FPrint-2_0-1.94.5+tod1-1.3.aarch64.rpm"
RPM_HASH = "143d80f088cb1e024d01963eca4547eb260cb91bcbabaec7739cb7445fe9afb1bad9dac4702837df37813de060d37a4cc0731376e7cd656be205fda46a0583c0"

RPROVIDES:${PN} += "typelib(FPrint) typelib-1_0-FPrint-2_0 typelib-1_0-FPrint-2_0(aarch-64)"
RDEPENDS:${PN} += "libfprint-2.so.2()(64bit) typelib(GLib) typelib(GObject) typelib(GUsb) typelib(Gio)"

inherit rpm
