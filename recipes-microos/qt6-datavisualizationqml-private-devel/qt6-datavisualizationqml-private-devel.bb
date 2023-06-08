SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualizationQml Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualizationQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-datavisualizationqml-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "46813a419d141e3e16540fe92899bfd039ced36a94506570e730535a921996710d3befdc3c1959b6fa1961196fcd57839bcc81a98b13b6a1dd07f14a27b4a623"

RPROVIDES:${PN} += "qt6-datavisualizationqml-private-devel qt6-datavisualizationqml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6DataVisualizationQml)"

inherit rpm
