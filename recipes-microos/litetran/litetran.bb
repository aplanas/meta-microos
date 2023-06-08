SUMMARY = "A translator on Qt"
DESCRIPTION = "LiteTran is a GUI for text translation (like Yandex.Translate). \
 \
 * Translate by text selection: select text, press the key combination \
   (Ctrl+Shift+T by default), and get the translation result in \
   a pop-up. It will not be necessary to open a web browser for \
   translation. \
 * Text speech (up to 100 characters). \
 * 37 supported languages."
LICENSE = "GPL-3.0-or-later"

PV = "1.3+git20161111"

RPM_NAME = "litetran-1.3+git20161111-3.9.aarch64.rpm"
RPM_HASH = "8f13abb596b9dd36806526fa407df2e774f3e91aa0658597047345698ac802999ada1b2839b15114ef7184b81d0c9817bfbcecb90d38303fe3a720f9c824130b"

RPROVIDES:${PN} += "application() application(litetran.desktop) litetran litetran(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
