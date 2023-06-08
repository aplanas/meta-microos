SUMMARY = "System tray that downloads and display info about the Turris router"
DESCRIPTION = "Spectator, systray tool to display various informations about the \
Turris router from CZ.nic"
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "spectator-0.6+git74.9ef0de5-1.27.aarch64.rpm"
RPM_HASH = "6c84492adc9e3a4dd8089618e41a19ff986728341e2cbb0a430b83d5f7583c7d32f2ab2b4cbd7daaf3903f197cc2d37bd91d42323deb2999ec59c40cfe2a9816"

RPROVIDES:${PN} += "application() application(spectator.desktop) spectator spectator(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libturris-spectator.so.0()(64bit) openssl"

inherit rpm
