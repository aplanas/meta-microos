SUMMARY = "Non-ABI stable API for the Qt 6 PositioningQuick Library"
DESCRIPTION = "This package provides private headers of libQt6PositioningQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-positioningquick-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0ef3b6cf08b1f46a595819d0a8f4704920d3a2417d0b461ff4d85b1d55e7b897e68e659706986285888bebf38fdb36c1500308e396891e80d2f6ed88556f9fd3"

RPROVIDES:${PN} += "qt6-positioningquick-private-devel qt6-positioningquick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6PositioningQuick) qt6-core-private-devel qt6-qml-private-devel qt6-quick-private-devel"

inherit rpm
