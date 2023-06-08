SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to display x-statuses of contacts using the QIP Infium \
jabber client."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-qipxstatusesplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "1c4913de4ad60fac12d49f38d72d5007aa8e9f7b67220b686e908088cd73a0e39876141c0fe75cbd651d5ac08f3749d91ceec015e9643024fc48a770d29803bf"

RPROVIDES:${PN} += "libqipxstatusesplugin.so()(64bit) psi+-plugins-qipxstatusesplugin psi+-plugins-qipxstatusesplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) psi+"

inherit rpm
