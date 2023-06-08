SUMMARY = "Qt6 Quick3DAssetImport library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dassetimport-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "84805e466ae3697996479a22d4398e3f48ed07b913f4c58d93171536f1ca6ddbe1fd4ba15612779bf04df367d25d20f8a1ba013b3aa8ab2cfa992716e8206d9f"

RPROVIDES:${PN} += "cmake(Qt6Quick3DAssetImport) pkgconfig(Qt6Quick3DAssetImport) qt6-quick3dassetimport-devel qt6-quick3dassetimport-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Quick3DUtils) libQt6Quick3DAssetImport6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick3DUtils)"

inherit rpm
