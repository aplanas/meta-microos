SUMMARY = "Qt 6 3DQuickInput library"
DESCRIPTION = "The Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DQuickInput6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "287b62dd871912d138f3ed9cc4377d27bb78e55f7c2c822d8e03b5b7ecc4686a1175adbbbe3e5357eb1a44fd1cbc4c7a494ec52042bf596337776377c6270253"

RPROVIDES:${PN} += "libQt63DQuickInput.so.6()(64bit) libQt63DQuickInput.so.6(Qt_6)(64bit) libQt63DQuickInput.so.6(Qt_6.0)(64bit) libQt63DQuickInput.so.6(Qt_6.1)(64bit) libQt63DQuickInput.so.6(Qt_6.2)(64bit) libQt63DQuickInput.so.6(Qt_6.3)(64bit) libQt63DQuickInput.so.6(Qt_6.4)(64bit) libQt63DQuickInput.so.6(Qt_6.5)(64bit) libQt63DQuickInput.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DQuickInput6 libQt63DQuickInput6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DInput.so.6()(64bit) libQt63DInput.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
