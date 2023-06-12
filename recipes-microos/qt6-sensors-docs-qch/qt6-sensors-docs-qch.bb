SUMMARY = "Documentation for qt6-sensors in QCH format"
DESCRIPTION = "This package contains documentation for qt6-sensors in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b6212af2325288e848b2c3f04e5e0d9f57c522582961c7994bea6a1278896b40b3659a0c36f04f1db084318483b825a5d81a2f41986221f8504d3cba3bd2144f"

RPROVIDES:${PN} += "qt6-sensors-docs-qch qt6-sensors-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
