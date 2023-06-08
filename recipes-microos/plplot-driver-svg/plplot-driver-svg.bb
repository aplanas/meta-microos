SUMMARY = "PLplot driver using the SVG backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the SVG driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-svg-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "d123ff55ca32dc3150d2119ee5125eabd07254d20f6bd9cbdf060472c1810a5837a721841fdcaed6d14ece338b3b2ce26517368b8dea86fcc31c4c5fa88fbb41"

RPROVIDES:${PN} += "plplot-driver-svg plplot-driver-svg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libplplot.so.17()(64bit) plplot-common"

inherit rpm
