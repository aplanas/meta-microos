SUMMARY = "Graphical user interface to launch Solarus games"
DESCRIPTION = "This package provides a graphical user interface to launch games \
based on the Solarus engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-gui-1.6.5-2.15.aarch64.rpm"
RPM_HASH = "6c5c5491ac96ab8414300f1a822a9f51df82d4f9a3b02fe405d4f4e6c911fc57cb825f43110c1ceef9319d7b8e2fe836710039720ad11827e0c4de2857891002"

RPROVIDES:${PN} += "application() \
application(org.solarus_games.solarus.Launcher.desktop) \
metainfo() \
metainfo(org.solarus_games.solarus.appdata.xml) \
solarus-gui \
solarus-gui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsolarus-gui.so.1()(64bit) \
libsolarus.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
