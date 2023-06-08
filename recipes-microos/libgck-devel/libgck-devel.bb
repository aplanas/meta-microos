SUMMARY = "Development files for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libgck-devel-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "f8e5d32a641c0453c90d6ada269fe56422a2bdc500828ad0edb8c48a023439fa476b43822b7581b2836b03be887e44cbe551674b87c7a3a133ed42f5212458ec"

RPROVIDES:${PN} += "libgck-devel libgck-devel(aarch-64) pkgconfig(gck-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgck-2-2 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(p11-kit-1) typelib-1_0-Gck-2"

inherit rpm
