SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to show reminders of upcoming birthdays."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-birthdayreminderplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "2481a10598792c698c29f001b0b1aa68f4bc00e4464257257917734f188971db8fd33f0a6a8ba151bce5ac868d8b5034a817a655739b3df006ff22b6d814d5a6"

RPROVIDES:${PN} += "libbirthdayreminderplugin.so()(64bit) psi+-plugins-birthdayreminderplugin psi+-plugins-birthdayreminderplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) psi+"

inherit rpm
