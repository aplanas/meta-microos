SUMMARY = "Qt6 Quick3DUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dutils-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3cbcdf284fba54b7665f6cd9cf27c62c65dae63276c7fccc83fd01071018d957d7bda2e7aede638af3b7caee177af43494b39561361bb7481a1f1b506588f4ab"

RPROVIDES:${PN} += "cmake(Qt6Quick3DUtils) pkgconfig(Qt6Quick3DUtils) qt6-quick3dutils-devel qt6-quick3dutils-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6Quick3DUtils6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) qt6-quick-private-devel"

inherit rpm
