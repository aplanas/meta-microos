SUMMARY = "Development files for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgck1-devel-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "c76a4da3f7eb257c250c53961efe5e4b285839efb3c50bf59c51111f8fbf411625aa77c5a45533b66619d9e603a5a6f3784be688ce7332e91a1f80203bf2b945"

RPROVIDES:${PN} += "libgck1-devel libgck1-devel(aarch-64) pkgconfig(gck-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgck-1-0 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(p11-kit-1) typelib-1_0-Gck-1"

inherit rpm
