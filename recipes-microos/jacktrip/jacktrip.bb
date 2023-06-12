SUMMARY = "Multi-machine network music performance over the Internet"
DESCRIPTION = "JackTrip is a system used for multi-machine network performance over the \
Internet. It supports any number of channels (as many as the \
computer/network can handle) of bidirectional, high quality, uncompressed \
audio signal streaming."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "jacktrip-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "611a6fe794b098f6554737e85d974670d575e31d4da57d48945a598d798fd5345e9187a95f7aa3adf4566b5461c379b1d97185dd2a1e343532ce171bdd20c623"

RPROVIDES:${PN} += "application() application(org.jacktrip.JackTrip.desktop) jacktrip jacktrip(aarch-64) metainfo() metainfo(org.jacktrip.JackTrip.metainfo.xml) mimehandler(application/jacktrip) mimehandler(x-scheme-handler/jacktrip)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5NetworkAuth.so.5()(64bit) libQt5NetworkAuth.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5WebSockets.so.5()(64bit) libQt5WebSockets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjack.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) librtaudio.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
