SUMMARY = "Graphical small-internet client"
DESCRIPTION = "Graphical small-internet client supporting gemini, http, https, gopher, finger."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "kristall-0.4-1.1.aarch64.rpm"
RPM_HASH = "8e1945105b7fca08c35115412ea1b414c2cc16e768910c042eea5a77cd6b91e5be2da487a8a2c7a809513a9eec83c5ebb447102d2649891385f581fceed019b2"

RPROVIDES:${PN} += "application() \
application(Kristall.desktop) \
kristall \
kristall(aarch-64) \
mimehandler(text/gemini) \
mimehandler(text/markdown) \
mimehandler(text/x-kristall-theme) \
mimehandler(x-scheme-handler/finger) \
mimehandler(x-scheme-handler/gemini) \
mimehandler(x-scheme-handler/gopher)"
RDEPENDS:${PN} += "libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5MultimediaWidgets.so.5()(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
