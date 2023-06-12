SUMMARY = "Qt 6 MultimediaQuick library"
DESCRIPTION = "The Qt 6 MultimediaQuick library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6MultimediaQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8d51269963461ffae5f0ea28883f6b9b937cc42d49efb02f0acf23eb4410ca39aeeeb874be24365f794f35413a69d3d94296add2bdbab435bbb92bc4199807b4"

RPROVIDES:${PN} += "libQt6MultimediaQuick.so.6()(64bit) libQt6MultimediaQuick.so.6(Qt_6)(64bit) libQt6MultimediaQuick.so.6(Qt_6.0)(64bit) libQt6MultimediaQuick.so.6(Qt_6.1)(64bit) libQt6MultimediaQuick.so.6(Qt_6.2)(64bit) libQt6MultimediaQuick.so.6(Qt_6.3)(64bit) libQt6MultimediaQuick.so.6(Qt_6.4)(64bit) libQt6MultimediaQuick.so.6(Qt_6.5)(64bit) libQt6MultimediaQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6MultimediaQuick6 libQt6MultimediaQuick6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libQt6Multimedia.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
