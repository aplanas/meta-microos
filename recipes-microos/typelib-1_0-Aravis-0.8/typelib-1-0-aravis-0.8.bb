SUMMARY = "Introspection bindings for aravis"
DESCRIPTION = "This package provides the GObject Introspection bindings for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "typelib-1_0-Aravis-0.8-0.8.26-1.1.aarch64.rpm"
RPM_HASH = "251a995acfcc74232783cf79487b81eefdeb5ee2a9e640e6874d309de8c351eeb47b7b0e8470dff990f6f35f617df09e53e837a61c66b6955b6bbe899598811d"

RPROVIDES:${PN} += "typelib(Aravis) typelib-1_0-Aravis-0.8 typelib-1_0-Aravis-0.8(aarch-64)"
RDEPENDS:${PN} += "libaravis-0.8.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
