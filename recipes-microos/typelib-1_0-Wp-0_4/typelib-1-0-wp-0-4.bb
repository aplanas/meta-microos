SUMMARY = "Introspection bindings for libwireplumber"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package provides the GObject Introspection bindings for \
the wireplumber shared library."
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "typelib-1_0-Wp-0_4-0.4.14-2.1.aarch64.rpm"
RPM_HASH = "e643b27a2ab47283d008028b8261eee2f89dd576f68ccb9bc895252a72cff8cdc63322a88de215b43c052f9b43d09b6d40646ec58fe561e0e4492e804b86e271"

RPROVIDES:${PN} += "typelib(Wp) typelib-1_0-Wp-0_4 typelib-1_0-Wp-0_4(aarch-64)"
RDEPENDS:${PN} += "libwireplumber-0.4.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
