SUMMARY = "Grantlee theme support"
DESCRIPTION = "the grantleetheme library adds Grantlee theme support for PIM applications."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "grantleetheme-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3e0d83ced3b50f7c66b05d05b05e528e85aef9bb0861aee99539862d75b0d7faa0750481e5208b3eb3e9bac468e063c4dee640b6818a4fd881dc49ad22941d6f"

RPROVIDES:${PN} += "grantleetheme grantleetheme(aarch-64)"
RDEPENDS:${PN} += "grantlee5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGrantlee_Templates.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
