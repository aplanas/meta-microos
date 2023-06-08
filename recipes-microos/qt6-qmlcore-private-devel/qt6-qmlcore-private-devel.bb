SUMMARY = "Non-ABI stable API for the Qt 6 QmlCore library"
DESCRIPTION = "This package provides private headers of libQt6QmlCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlcore-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "a25e808528e39ea62184012716172bbad13468c440678646240e7cacb81a5ff04e1c292c9c6bc01bf564023990cfdeeb35db069d49a09605153677deff73475e"

RPROVIDES:${PN} += "qt6-qmlcore-private-devel qt6-qmlcore-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QmlCore)"

inherit rpm
