SUMMARY = "MPFR multiple-precision floating-point library development files"
DESCRIPTION = "MPFR multiple-precision floating-point library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-mpfr-devel-3.1.4-2.12.noarch.rpm"
RPM_HASH = "fc1b4b3b7718aaed8553e76615e6286c316785b59b2f4e13e5ab05780c980696fdf8e2fbd39bda3a13452c5582177c861ad6e3fc2c9c806945c3324d48cf5d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(lib:mpfr) mingw64-mpfr-devel"
RDEPENDS:${PN} += "mingw64(lib:gmp)"

inherit rpm
