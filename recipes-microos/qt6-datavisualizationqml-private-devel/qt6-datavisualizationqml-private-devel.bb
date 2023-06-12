SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualizationQml Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualizationQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualizationqml-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "34a40f9e5a6da87a8371d635afef46504702549a9ff9f4b33a64103bd45c682b2eb23575a8a2defd817f0ca5e7d2d5a4bea38335e69fec1b791bd6b414501da1"

RPROVIDES:${PN} += "qt6-datavisualizationqml-private-devel \
qt6-datavisualizationqml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6DataVisualizationQml)"

inherit rpm
