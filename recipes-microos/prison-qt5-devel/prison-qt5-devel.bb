SUMMARY = "Development files for prison-qt5, a barcode abstraction library"
DESCRIPTION = "Development files for prison, a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.106.0"

RPM_NAME = "prison-qt5-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1c9bdff0688cb43625433bf4545c746b7bb53c8cac0677143b985c4388a27d9474e1670397e732e3cef53e47c04ea3619ac2a9dc0e6813768a482e4ff3ad6675"

RPROVIDES:${PN} += "cmake(KF5Prison) prison-qt5-devel prison-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Gui) libKF5Prison5"

inherit rpm
