SUMMARY = "Welcome utility for openSUSE"
DESCRIPTION = "A welcome utility built to welcome new users to openSUSE."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.9+git.0.66be0d8"

RPM_NAME = "opensuse-welcome-0.1.9+git.0.66be0d8-1.2.aarch64.rpm"
RPM_HASH = "9afbb8d3cb406777b6d17db371b172c22b0dae81bac564060cb5e670e4317db653201411baed0122d57de846c741451bb4f75c9f8c16fb1f32902885d361dd2f"

RPROVIDES:${PN} += "application() \
application(org.opensuse.opensuse_welcome.desktop) \
metainfo() \
metainfo(org.opensuse.opensuse_welcome.appdata.xml) \
opensuse-welcome \
opensuse-welcome(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5WebEngine.so.5()(64bit) \
libQt5WebEngine.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
