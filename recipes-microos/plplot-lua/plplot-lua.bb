SUMMARY = "PLplot functions for scientific plotting with Lua"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with Lua."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-lua-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "1143dce5f41e4aab5b86a9a303c43d6468588e5769d10b30ec99c1dcef4c9a07ea11e7f26d7bb9ff5cc82c5694ed3371fd12d21315d8ccd8caf35c74931c0058"

RPROVIDES:${PN} += "plplot-lua plplot-lua(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblua5.4.so.5()(64bit) libplplot.so.17()(64bit) lua plplot-common"

inherit rpm
