SUMMARY = "Qt 6 WebChannel library"
DESCRIPTION = "The Qt 6 WebChannel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6WebChannel6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7af4ca1f07f9ab08323f7e20deb2829e485464437fb020c8f56a655671115ce4f0893a78f704e0a72089289df8bd88c51ec55a2f34c606a4ad08f6fa37aa8b68"

RPROVIDES:${PN} += "libQt6WebChannel.so.6()(64bit) libQt6WebChannel.so.6(Qt_6)(64bit) libQt6WebChannel.so.6(Qt_6.0)(64bit) libQt6WebChannel.so.6(Qt_6.1)(64bit) libQt6WebChannel.so.6(Qt_6.2)(64bit) libQt6WebChannel.so.6(Qt_6.3)(64bit) libQt6WebChannel.so.6(Qt_6.4)(64bit) libQt6WebChannel.so.6(Qt_6.5)(64bit) libQt6WebChannel.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WebChannel6 libQt6WebChannel6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
