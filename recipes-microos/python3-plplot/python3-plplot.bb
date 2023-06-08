SUMMARY = "PLplot functions for scientific plotting with Python"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot's Python binding."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "python3-plplot-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "2ad69a79d398e578477d7ac3b2b6c2becd74b658d9eae9fa116f1c8202d0578191fe088cf2fa8f122f83ae47539d67183fb27e682625d5b57e00d2ff9b376ee9"

RPROVIDES:${PN} += "python-plplot python3-plplot python3-plplot(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libplplot.so.17()(64bit) libpython3.10.so.1.0()(64bit) plplot-common python(abi)"

inherit rpm
