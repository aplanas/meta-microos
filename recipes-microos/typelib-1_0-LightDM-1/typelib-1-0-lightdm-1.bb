SUMMARY = "GObject Introspection Bindings for the LightDM Client Library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
LightDM client library."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "typelib-1_0-LightDM-1-1.32.0-2.2.aarch64.rpm"
RPM_HASH = "0b94551d68ac246901a2b24108919daf0ecfeae79beeee52a7eb3de705bd1c6422b5e5c0b1e8d3f986a9078b246c1e85bd5ae97af6e34c1afa8f90b89eb507ef"

RPROVIDES:${PN} += "typelib(LightDM) typelib-1_0-LightDM-1 typelib-1_0-LightDM-1(aarch-64)"
RDEPENDS:${PN} += "liblightdm-gobject-1.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
