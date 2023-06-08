SUMMARY = "Graphical small-internet client"
DESCRIPTION = "Graphical small-internet client supporting gemini, http, https, gopher, finger."
LICENSE = "GPL-3.0-or-later"

PV = "0.3"

RPM_NAME = "kristall-0.3-1.16.aarch64.rpm"
RPM_HASH = "6f855eefebb4afda5426dc4068523e6f654d51ca6901b187ca40d81739736a65c38f7bae2b54c517e280df74e52092ac547a632e2d4376f86c980dd17310f9a3"

RPROVIDES:${PN} += "application() application(Kristall.desktop) kristall kristall(aarch-64) mimehandler(x-scheme-handler/finger) mimehandler(x-scheme-handler/gemini) mimehandler(x-scheme-handler/gopher)"
RDEPENDS:${PN} += "libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5MultimediaWidgets.so.5()(64bit) libQt5MultimediaWidgets.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
