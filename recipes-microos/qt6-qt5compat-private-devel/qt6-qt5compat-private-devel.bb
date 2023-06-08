SUMMARY = "Non-ABI stable API for the Qt 6 Qt5 Compat library"
DESCRIPTION = "This package provides private headers of libQt6Core5Compat that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qt5compat-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b288279318cd3307b946ed653414bb9d333923d4eb55adc3c9c8cf443611ad2c6aa9768e924558da2eb3ff9a0d7bbb04eb0235d1a22dc7b8732d0fce08767dfe"

RPROVIDES:${PN} += "qt6-qt5compat-private-devel qt6-qt5compat-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core5Compat) qt6-core-private-devel"

inherit rpm
