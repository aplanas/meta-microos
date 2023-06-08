SUMMARY = "Non-ABI stable API for the Qt 6 QuickWidgets library"
DESCRIPTION = "This package provides private headers of libQt6QuickWidgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickwidgets-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "0ef6997121529d999380dfe2427363c21c8a7b6aaaa1a2450c64e53e206d231d6a8d2a84f32ce0f93d9f7f8757204ff12129eeacc7e082958bcf03a371b02363"

RPROVIDES:${PN} += "qt6-quickwidgets-private-devel qt6-quickwidgets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickWidgets) qt6-core-private-devel qt6-gui-private-devel qt6-qml-private-devel qt6-quick-private-devel qt6-widgets-private-devel"

inherit rpm
