SUMMARY = "Header files for the sympol library"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. \
This package contains the header files for using the sympol library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "sympol-devel-0.1.9-1.10.aarch64.rpm"
RPM_HASH = "5de09e857dd5b493761dae12eb7442aafaa1fa0030573e835572f251fb400c792e32728ad6102519019314890d23026cc24c721e9105671d2b8f89965800f80d"

RPROVIDES:${PN} += "sympol-devel sympol-devel(aarch-64)"
RDEPENDS:${PN} += "libsympol0_1 permlib-devel"

inherit rpm
