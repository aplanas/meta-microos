SUMMARY = "Non-ABI stable API for the Qt 6 SensorsQuick library"
DESCRIPTION = "This package provides private headers of libQt6SensorsQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-sensorsquick-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0d3e16df3008e73d185c913df7a5a5e6e619cfb29ce78329944e51b8ebd603198384351e09383f38e0cdd2ba6d96067b3c23c784548a4d2f18d3cb0ce7a5b080"

RPROVIDES:${PN} += "qt6-sensorsquick-private-devel qt6-sensorsquick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6SensorsQuick)"

inherit rpm
