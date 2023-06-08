SUMMARY = "Development files for the Qt 6 3DQuickInput library"
DESCRIPTION = "Development files for the Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickinput-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0ed991e6b05ce0a608c843d8acae059636105d12bf9c3880df0239283d6f708e57b54aa1a524a2f4724240207634a58e4d6f86f5f8de7e8f0f995de5f09b4629"

RPROVIDES:${PN} += "cmake(Qt63DQuickInput) pkgconfig(Qt63DQuickInput) qt6-3dquickinput-devel qt6-3dquickinput-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt63DInput) cmake(Qt63DQuick) cmake(Qt6Gui) cmake(Qt6Qml) libQt63DQuickInput6 pkgconfig(Qt63DCore) pkgconfig(Qt63DInput) pkgconfig(Qt63DQuick) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml)"

inherit rpm
