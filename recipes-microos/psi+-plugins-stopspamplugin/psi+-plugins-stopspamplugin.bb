SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to block spam messages and other unwanted information \
from Psi+ users."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-stopspamplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "b30185705c80e43a4a6beef853f0a03a181f741e1eba2d46ce75eed205eeebc108efe4fbfe8d03a96c3fa05a98b4ba07b363c747e981d65783bd16984bf85eb6"

RPROVIDES:${PN} += "libstopspamplugin.so()(64bit) psi+-plugins-stopspamplugin psi+-plugins-stopspamplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) psi+"

inherit rpm
