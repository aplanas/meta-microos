SUMMARY = "LeechCraft Aggregator Web Interface Module"
DESCRIPTION = "WebAccess provides a basic web interface for the \
Aggregator feed reader, so one can read news \
articles from a mobile device or another machine."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-aggregator-webaccess-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "54da2b12da4a2f381f388a93b94ac327c67e4db56873b641f2a70a6a3d4ba0cfc39d0b6bc3b14258e7b05cfa62034de64ab206a9e59407b15991fc6292f4f7cb"

RPROVIDES:${PN} += "leechcraft-aggregator-webaccess leechcraft-aggregator-webaccess(aarch-64) libleechcraft_aggregator_webaccess.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-aggregator libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-models-qt5.so.0.6.75.1()(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xsd-qt5.so.0.6.75()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwt.so.4.8.1()(64bit) libwthttp.so.4.8.1()(64bit)"

inherit rpm
