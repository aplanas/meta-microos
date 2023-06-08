SUMMARY = "Development files for the GNU multiple-precision floating-point library"
DESCRIPTION = "Development files for the GNU multiple-precision floating-point library. \
 \
The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "mpfr-devel-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "6d9d713cabd6fe00cd135729922b76cd65e1e89e6c35cce947c0658ec1cc29e42bcb4ab6e753368f95a6be9baff1de2d0cf36e9ff36216190514a5b0b894c1ef"

RPROVIDES:${PN} += "mpfr-devel mpfr-devel(aarch-64) pkgconfig(mpfr)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config gmp-devel libmpfr6"

inherit rpm
