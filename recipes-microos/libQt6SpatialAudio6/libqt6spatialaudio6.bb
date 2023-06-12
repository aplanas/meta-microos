SUMMARY = "Qt 6 SpatialAudio library"
DESCRIPTION = "The Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6SpatialAudio6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c4df8d17c2291102a60f89b08bb3f10bacaae5d0ec3e6c896d8153567ecbc5ef5a3fb24b2d24f2a7c9a782b423a3adfd499781cfc95cb34e6d303ad2800ace31"

RPROVIDES:${PN} += "libQt6SpatialAudio.so.6()(64bit) libQt6SpatialAudio.so.6(Qt_6)(64bit) libQt6SpatialAudio.so.6(Qt_6.0)(64bit) libQt6SpatialAudio.so.6(Qt_6.1)(64bit) libQt6SpatialAudio.so.6(Qt_6.2)(64bit) libQt6SpatialAudio.so.6(Qt_6.3)(64bit) libQt6SpatialAudio.so.6(Qt_6.4)(64bit) libQt6SpatialAudio.so.6(Qt_6.5)(64bit) libQt6SpatialAudio.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6SpatialAudio6 libQt6SpatialAudio6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.32)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
