SUMMARY = "Qt 6 MultimediaQuick library"
DESCRIPTION = "The Qt 6 MultimediaQuick library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6MultimediaQuick6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "0ac492ae2bafd10a569c9d8b13bb933394b4eb34f31134e00cd9f4c74dcb2d2ca00b4887a317aca0e3529f0e6ca29c49d17fcd38861cb1c683c95e5fedc86f38"

RPROVIDES:${PN} += "libQt6MultimediaQuick.so.6()(64bit) libQt6MultimediaQuick.so.6(Qt_6)(64bit) libQt6MultimediaQuick.so.6(Qt_6.0)(64bit) libQt6MultimediaQuick.so.6(Qt_6.1)(64bit) libQt6MultimediaQuick.so.6(Qt_6.2)(64bit) libQt6MultimediaQuick.so.6(Qt_6.3)(64bit) libQt6MultimediaQuick.so.6(Qt_6.4)(64bit) libQt6MultimediaQuick.so.6(Qt_6.5)(64bit) libQt6MultimediaQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6MultimediaQuick6 libQt6MultimediaQuick6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libQt6Multimedia.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
