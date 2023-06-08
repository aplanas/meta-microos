SUMMARY = "Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "The Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickDialogs2Utils6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "fc2f8b1a3ae367ef3ec1d22a4a24e41eec53886919587f0ad01e57ecd2cc95b72f1f6d05d2469e0ed96d45c8b5f0ea38893c08491584a2c3bcc6df43a6c47751"

RPROVIDES:${PN} += "libQt6QuickDialogs2Utils.so.6()(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6)(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.0)(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.1)(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.2)(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.3)(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.4)(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.5)(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickDialogs2Utils6 libQt6QuickDialogs2Utils6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
