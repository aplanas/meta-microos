SUMMARY = "Graphical interface for displaying OATH codes with a Yubikey"
DESCRIPTION = "The Yubico Authenticator is a graphical desktop tool for generating \
Open AuTHentication (OATH) event-based HOTP and time-based TOTP \
one-time password codes, with the help of a Yubikey NEO that protects \
the shared secrets."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "yubioath-desktop-5.1.0-2.1.aarch64.rpm"
RPM_HASH = "872c9d0cb91bd8b918da0ae9e551e2e4242dd2cca8d7ed429ecdf182f9ae099e5455d525c2718c38bf329384b8715265f518fa0fc3e5eec3a773de2eb2285bc9"

RPROVIDES:${PN} += "application() application(yubioath-desktop.desktop) yubioath-desktop yubioath-desktop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libqt5-qtgraphicaleffects libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) pyotherside yubikey-manager"

inherit rpm
