SUMMARY = "Introspection bindings for libjcat"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.13"

RPM_NAME = "typelib-1_0-Jcat-1_0-0.1.13-1.1.aarch64.rpm"
RPM_HASH = "867ad0bbeeb523ec577777c05c6172e626dfdfc8541b37a1c90432bf1bc710f27f2cb10ef7279320ee23c8123c7f16376c82f4c2b1c45f55037c111d99cfa618"

RPROVIDES:${PN} += "typelib(Jcat) \
typelib-1_0-Jcat-1_0 \
typelib-1_0-Jcat-1_0(aarch-64)"
RDEPENDS:${PN} += "libjcat.so.1()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Json)"

inherit rpm
