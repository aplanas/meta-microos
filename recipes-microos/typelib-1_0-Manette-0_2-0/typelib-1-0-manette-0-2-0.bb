SUMMARY = "GObject introspection bindings for liblibmanette"
DESCRIPTION = "libmanette allows easy access to game controllers. \
This subpackage contains the gobject bindings for the liblibmanette \
shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "typelib-1_0-Manette-0_2-0-0.2.6-2.10.aarch64.rpm"
RPM_HASH = "846bb1168f8f716e0a87170de909e04fcf2f1c22d509c4b4754231136801ede2440a0c88e2a43d6ebacb4a7493779677f4f489e20bea625987e8f9f60ddabc73"

RPROVIDES:${PN} += "typelib(Manette) typelib-1_0-Manette-0_2-0 typelib-1_0-Manette-0_2-0(aarch-64)"
RDEPENDS:${PN} += "libmanette-0.2.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(GUdev) typelib(Gio)"

inherit rpm
