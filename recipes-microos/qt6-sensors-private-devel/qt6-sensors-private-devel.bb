SUMMARY = "Non-ABI stable API for the Qt 6 Sensors library"
DESCRIPTION = "This package provides private headers of libQt6Sensors that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-sensors-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "e28a63c08f94e4c3684adae8be2f52d34401fee7a6d0e1df2b0e576f2234a0cb148fa4d47eb11df662f41eab0cda9d8b9d330584acd95f790fe4c6c01a8cc7ae"

RPROVIDES:${PN} += "qt6-sensors-private-devel qt6-sensors-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Sensors)"

inherit rpm
