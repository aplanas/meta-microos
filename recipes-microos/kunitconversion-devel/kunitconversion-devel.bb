SUMMARY = "Converting physical units: Build Environment"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons). \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kunitconversion-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "8cf604dc2dc2f569c9021df05b47614dd8a7d3e592dc3d262d279789674bb935c46f579fe9bbdba31670353de7f0fba0b129bcf190ca885a3c4b4cae46257342"

RPROVIDES:${PN} += "cmake(KF5UnitConversion) kunitconversion-devel kunitconversion-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5UnitConversion5"

inherit rpm
