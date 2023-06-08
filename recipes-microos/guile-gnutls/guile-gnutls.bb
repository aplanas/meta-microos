SUMMARY = "Guile bindings to GnuTLS"
DESCRIPTION = "GnuTLS wrappers for GNU Guile, a dialect of Scheme."
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.11"

RPM_NAME = "guile-gnutls-3.7.11-1.1.aarch64.rpm"
RPM_HASH = "3c2769cb3bd3d9639cc6c9e2bd36bfd99ae46ccb1d311f148746cdb1ca1631f7855d42dce5c20a4d450b4fe5ba4a43f6f85d1e1507f4838eb164deec4de2a53e"

RPROVIDES:${PN} += "gnutls-guile guile-gnutls guile-gnutls(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_3_6_3)(64bit) libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit)"

inherit rpm
