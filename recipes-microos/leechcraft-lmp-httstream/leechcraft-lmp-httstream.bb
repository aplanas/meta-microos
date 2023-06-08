SUMMARY = "LeechCraft Music Streamer Module"
DESCRIPTION = "This package provides a streamer plugin for LeechCraft player \
to stream music from LMP via HTTP."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-httstream-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "1a0dff5e625bd82ac3d13612c0d237690805fc2e7f768e04d92d4f32e2d855358364bbb54df74ab20173e2c86055572f108abd85bcf7954bec0f4bc432d39bcb"

RPROVIDES:${PN} += "leechcraft-lmp-httstream leechcraft-lmp-httstream(aarch-64) libleechcraft_lmp_httstream.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-lmp libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libleechcraft-util-network-qt5.so.0.6.75.1()(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-xsd-qt5.so.0.6.75()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
