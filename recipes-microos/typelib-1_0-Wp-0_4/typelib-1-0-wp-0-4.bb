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

RPM_NAME = "typelib-1_0-Wp-0_4-0.4.14-1.1.aarch64.rpm"
RPM_HASH = "23d268ad884218aa9a305872a7944f4c1b1092fb2ab358277d56caf57a5b2e848bc61e4eeee207328537cdeba965f58dcab8eaa5067acdc1dd243e95691a6059"

RPROVIDES:${PN} += "typelib(Wp) typelib-1_0-Wp-0_4 typelib-1_0-Wp-0_4(aarch-64)"
RDEPENDS:${PN} += "libwireplumber-0.4.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
