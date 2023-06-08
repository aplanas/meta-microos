SUMMARY = "Header files, libraries and development documentation for libqalculate"
DESCRIPTION = "This package contains the header files and development \
documentation for libqalculate. If you like to develop programs using libqalculate, \
you will need to install libqalculate-devel."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "libqalculate-devel-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "6316d559eec7bfb651e942820b88c9ab51dc1524b27505f84c0dda9aee6d19e3947e33ccc130a45826654be1b47c811fb5e0f0d5555c481909057954b7610d98"

RPROVIDES:${PN} += "libqalculate-devel libqalculate-devel(aarch-64) pkgconfig(libqalculate)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gmp-devel libqalculate pkgconfig(libxml-2.0) pkgconfig(mpfr)"

inherit rpm
