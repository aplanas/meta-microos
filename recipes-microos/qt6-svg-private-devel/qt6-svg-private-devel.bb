SUMMARY = "Non-ABI stable API for the Qt 6 SVG libraries"
DESCRIPTION = "This package provides private headers of libQt6Svg that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-svg-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "513d15fd965c255e832d0fdf7c8ddbb0b3e6a701e42f1aa097ad13f12789cbc3f83ed331aff39d73a7fc0db137eb3eb21d42ce4e28a6e1df0d6c0c434be85dd1"

RPROVIDES:${PN} += "qt6-svg-private-devel qt6-svg-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Svg) cmake(Qt6SvgWidgets) qt6-core-private-devel qt6-gui-private-devel qt6-widgets-private-devel"

inherit rpm
