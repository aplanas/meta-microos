SUMMARY = "Qt5-based Password Manager"
DESCRIPTION = "A password manager or safe which manages your passwords. Databases \
are locked with a master key/password or a key disk. The databases \
are encrypted using AES and Twofish."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.4"

RPM_NAME = "keepassxc-2.7.4-1.6.aarch64.rpm"
RPM_HASH = "ca459f5ebb553b450310579dd8adb8a4e5e77c98ca6e24f79b25a57e34579ee13cf21dea559b293593985e385dfd92c916e8e6cb04150351adfee942c6d689be"

RPROVIDES:${PN} += "application() application(org.keepassxc.KeePassXC.desktop) keepassx keepassxc keepassxc(aarch-64) libkeepassxc-autotype-xcb.so()(64bit) metainfo() metainfo(org.keepassxc.KeePassXC.appdata.xml) mimehandler(application/x-keepass2)"
RDEPENDS:${PN} += "hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Concurrent.so.5()(64bit) libQt5Concurrent.so.5(Qt_5)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libargon2.so.1()(64bit) libbotan-2.so.19()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libminizip.so.1()(64bit) libpcsclite.so.1()(64bit) libqrencode.so.4()(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libusb-1.0.so.0()(64bit) libz.so.1()(64bit) shared-mime-info update-desktop-files"

inherit rpm
