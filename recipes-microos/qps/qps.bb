SUMMARY = "Visual Process Manager"
DESCRIPTION = "Qps is a visual process manager, an X11 version of 'top' or 'ps' that \
displays processes in a window and lets you sort and manipulate them. It \
displays some general system information, and many details about current \
processes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "qps-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "2f85ff98204b0ff38cc9869c7f6fdfd05eedf4fee1cfb197e8891d81bb0168457d08eef7b57c9c23ea4b9907e011996178aa0863ddac03a75c5589d24428bc5f"

RPROVIDES:${PN} += "application() application(qps.desktop) qps qps(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblxqt.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
