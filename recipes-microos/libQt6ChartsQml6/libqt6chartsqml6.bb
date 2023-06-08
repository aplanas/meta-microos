SUMMARY = "Qt 6 ChartsQml library"
DESCRIPTION = "The Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6ChartsQml6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6e66d64db71fa36d928790f253fcfeab4c79b27a1362d587bd61ba8c5ee8e77c888a109e070dbed0397f6869c70b27c72fb18a1ace8de17db6b3118537b8a3c0"

RPROVIDES:${PN} += "libQt6ChartsQml.so.6()(64bit) libQt6ChartsQml.so.6(Qt_6)(64bit) libQt6ChartsQml.so.6(Qt_6.0)(64bit) libQt6ChartsQml.so.6(Qt_6.1)(64bit) libQt6ChartsQml.so.6(Qt_6.2)(64bit) libQt6ChartsQml.so.6(Qt_6.3)(64bit) libQt6ChartsQml.so.6(Qt_6.4)(64bit) libQt6ChartsQml.so.6(Qt_6.5)(64bit) libQt6ChartsQml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6ChartsQml6 libQt6ChartsQml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Charts.so.6()(64bit) libQt6Charts.so.6(Qt_6)(64bit) libQt6Charts.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
