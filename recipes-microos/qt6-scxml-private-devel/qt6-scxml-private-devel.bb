SUMMARY = "Non-ABI stable API for the Qt 6 Scxml library"
DESCRIPTION = "This package provides private headers of libQt6Scxml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-scxml-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "e4f28e298ca343138f07ab5fdc1460223268c68c54c969085084e5c23a132298f52ce518b72499e3375af2cce32601b38ec26e1631d9581a66ceb9c920d8a088"

RPROVIDES:${PN} += "qt6-scxml-private-devel qt6-scxml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Scxml) qt6-qml-private-devel"

inherit rpm
