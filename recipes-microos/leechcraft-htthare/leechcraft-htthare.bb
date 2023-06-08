SUMMARY = "LeechCraft HTTP Server Module"
DESCRIPTION = "This package provides content from local filesystem over LANs. \
(Possibly also WANs, but, by default, only LAN interfaces are listened on)."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-htthare-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "f4742bf54e30645d60c479797b29837718c7f1c610345f5a3dc4cdb561d0045333cd9446835a8b6da20e4e3ae009b2deb2d9dd761c14ad37f47e3e010f385bcc"

RPROVIDES:${PN} += "leechcraft-htthare leechcraft-htthare(aarch-64) libleechcraft_htthare.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xsd-qt5.so.0.6.75()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
