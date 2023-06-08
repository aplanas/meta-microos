SUMMARY = "Qt 6 3DQuickAnimation library"
DESCRIPTION = "The Qt 6 3DQuickAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DQuickAnimation6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1d00c33b0f7fa9ed7e3d90e749943354218260c9ab1fd8068281c974d979afa5b1bcc20608ca14a9e03ca613daff5d55bd88df4b09c98da59c33d092ebf4da64"

RPROVIDES:${PN} += "libQt63DQuickAnimation.so.6()(64bit) libQt63DQuickAnimation.so.6(Qt_6)(64bit) libQt63DQuickAnimation.so.6(Qt_6.0)(64bit) libQt63DQuickAnimation.so.6(Qt_6.1)(64bit) libQt63DQuickAnimation.so.6(Qt_6.2)(64bit) libQt63DQuickAnimation.so.6(Qt_6.3)(64bit) libQt63DQuickAnimation.so.6(Qt_6.4)(64bit) libQt63DQuickAnimation.so.6(Qt_6.5)(64bit) libQt63DQuickAnimation.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DQuickAnimation6 libQt63DQuickAnimation6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DAnimation.so.6()(64bit) libQt63DAnimation.so.6(Qt_6)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
