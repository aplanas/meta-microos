SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualization Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualization that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-datavisualization-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ed3a5581b282762212b4a3ededcb739fed893a734cca0d94c0190777ba02247f5141cbe1870461596c58fca748be37d27fc43675facd0d9bf7650dfc4d7e5d1c"

RPROVIDES:${PN} += "qt6-datavisualization-private-devel qt6-datavisualization-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6DataVisualization)"

inherit rpm
