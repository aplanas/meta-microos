SUMMARY = "Qt 6 MultimediaWidgets library"
DESCRIPTION = "The Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6MultimediaWidgets6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "37a5013286147c7c1aac7e1d3e468735a6a1659da2147b6b408732ac56ee76de7f3529a550e76b538723c5176c508e65e341870d39a2c156d397407aa6d31358"

RPROVIDES:${PN} += "libQt6MultimediaWidgets.so.6()(64bit) libQt6MultimediaWidgets.so.6(Qt_6)(64bit) libQt6MultimediaWidgets.so.6(Qt_6.0)(64bit) libQt6MultimediaWidgets.so.6(Qt_6.1)(64bit) libQt6MultimediaWidgets.so.6(Qt_6.2)(64bit) libQt6MultimediaWidgets.so.6(Qt_6.3)(64bit) libQt6MultimediaWidgets.so.6(Qt_6.4)(64bit) libQt6MultimediaWidgets.so.6(Qt_6.5)(64bit) libQt6MultimediaWidgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6MultimediaWidgets6 libQt6MultimediaWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libQt6Multimedia.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
