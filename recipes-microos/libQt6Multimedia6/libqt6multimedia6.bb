SUMMARY = "Qt 6 Multimedia library"
DESCRIPTION = "The Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Multimedia6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "90f29e85d5436ae3962017141153df01536205bfc4901046ef4d4043d2272646a0629a3ca78cf66bf1e7ed9a62d5ecc7b293788d390a54f2fb15417cdfe5dc3b"

RPROVIDES:${PN} += "libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libQt6Multimedia.so.6(Qt_6.0)(64bit) libQt6Multimedia.so.6(Qt_6.1)(64bit) libQt6Multimedia.so.6(Qt_6.2)(64bit) libQt6Multimedia.so.6(Qt_6.3)(64bit) libQt6Multimedia.so.6(Qt_6.4)(64bit) libQt6Multimedia.so.6(Qt_6.5)(64bit) libQt6Multimedia.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Multimedia6 libQt6Multimedia6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
