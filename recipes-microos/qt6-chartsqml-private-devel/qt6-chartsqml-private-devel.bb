SUMMARY = "Non-ABI stable API for the Qt 6 ChartsQml Library"
DESCRIPTION = "This package provides private headers of libQt6ChartsQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-chartsqml-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7882fb56f49eb6575295604c0cf064b3d24525aaeb8c9815dc51533b88beb79657fa25c08dc0cb838054ca636d5b6022da8d779e3ccd8880787c2726d9d1a0a9"

RPROVIDES:${PN} += "qt6-chartsqml-private-devel qt6-chartsqml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6ChartsQml)"

inherit rpm
