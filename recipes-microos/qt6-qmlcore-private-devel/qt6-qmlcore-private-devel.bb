SUMMARY = "Non-ABI stable API for the Qt 6 QmlCore library"
DESCRIPTION = "This package provides private headers of libQt6QmlCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcore-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8fefec54c3a0d968a85dd0cc9f24733e4b8953f056ef8bd50f80f07c45bc8fca768cfb18916780b69ebac645bf5e0b9f51cefa4e5ff34b95a20fa0dc1920798a"

RPROVIDES:${PN} += "qt6-qmlcore-private-devel qt6-qmlcore-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QmlCore)"

inherit rpm
