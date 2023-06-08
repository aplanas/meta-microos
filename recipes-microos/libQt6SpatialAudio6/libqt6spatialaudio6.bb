SUMMARY = "Qt 6 SpatialAudio library"
DESCRIPTION = "The Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6SpatialAudio6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "7b1b1eab7d84afa47ec94753b5a9ff5c0ce22be6ba4e86fed19c79089cb8fbeb59e674bc06946fc80ba1ceb3bfceacf1fb5d8426889bd313054ff6ceaad505f8"

RPROVIDES:${PN} += "libQt6SpatialAudio.so.6()(64bit) libQt6SpatialAudio.so.6(Qt_6)(64bit) libQt6SpatialAudio.so.6(Qt_6.0)(64bit) libQt6SpatialAudio.so.6(Qt_6.1)(64bit) libQt6SpatialAudio.so.6(Qt_6.2)(64bit) libQt6SpatialAudio.so.6(Qt_6.3)(64bit) libQt6SpatialAudio.so.6(Qt_6.4)(64bit) libQt6SpatialAudio.so.6(Qt_6.5)(64bit) libQt6SpatialAudio.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6SpatialAudio6 libQt6SpatialAudio6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.32)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
