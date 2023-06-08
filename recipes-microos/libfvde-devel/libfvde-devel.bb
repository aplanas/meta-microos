SUMMARY = "Header files and libraries for developing applications for libfvde"
DESCRIPTION = "Header files and libraries for developing applications for libfvde \
 \
See libfvde for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libfvde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-devel-20220915-3.11.aarch64.rpm"
RPM_HASH = "7a44da9360084e2076fffb437ece1d4c6bf2f9ea057df4f6ca8df8fe327f64f62c6baf3ad755a8596cd8f9e1b6ee2685827903dcc47d5a4b9e514f2f13ccfde0"

RPROVIDES:${PN} += "libfvde-devel libfvde-devel(aarch-64) pkgconfig(libfvde)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libfvde1"

inherit rpm
