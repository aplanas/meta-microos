SUMMARY = "Qt 6 Quick3DAssetImport library"
DESCRIPTION = "The Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DAssetImport6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "dc9935a3d78d79f7f951a9e0c003cb07fad03edef496b6767f2baec6adb40cbc88798850d2348520024b0951e8695a3cd24098c4b01eee60d43cffa4299a1d7a"

RPROVIDES:${PN} += "libQt6Quick3DAssetImport.so.6()(64bit) libQt6Quick3DAssetImport.so.6(Qt_6)(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.0)(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.1)(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.2)(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.3)(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.4)(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.5)(64bit) libQt6Quick3DAssetImport.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DAssetImport6 libQt6Quick3DAssetImport6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
