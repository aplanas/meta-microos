SUMMARY = "Introspection bindings for libmsi, a library to inspect and build .msi files"
DESCRIPTION = "libmsi is a port of (and a subset of) Wine's implementation of the Windows \
Installer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.101"

RPM_NAME = "typelib-1_0-Libmsi-1_0-0.101-1.10.aarch64.rpm"
RPM_HASH = "949e50a7ee71f3907d239ee09b4c3d6f1d7ec6244559335a0d6a480c8e85f041bb30f462719670a91b67adfbfbb1d548103d8f9aa93ff3ac77cc7d50fe166bc7"

RPROVIDES:${PN} += "typelib(Libmsi) \
typelib-1_0-Libmsi-1_0 \
typelib-1_0-Libmsi-1_0(aarch-64)"
RDEPENDS:${PN} += "libmsi.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
