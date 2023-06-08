SUMMARY = "Development files for prison-qt5, a barcode abstraction library"
DESCRIPTION = "Development files for prison, a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.105.0"

RPM_NAME = "prison-qt5-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "97c188bb510289c8672acbee8708d0d0df9862b41ab4a61d22c80752fcfc5ef00fd81b9b56da6f61d8c42da9061da411a0cba5a2821e708ff40ae89c1501f716"

RPROVIDES:${PN} += "cmake(KF5Prison) prison-qt5-devel prison-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Gui) libKF5Prison5"

inherit rpm
