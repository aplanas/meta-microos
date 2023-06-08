SUMMARY = "LeechCraft Azoth Emoticon pack support"
DESCRIPTION = "This package provides an emoticons plugin for LeechCraft Azoth which \
permits to use emoticon packs which are stored in Psi+, Kopete \
format or Azoth format."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-nativeemoticons-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "add9a09c61d6d0e96711ffe0cca615575f7f7646b4d868acf309946a9c630f358571738b0cfd07779fe85c1241d00386ad6ca9037280b4e4810d63da342dcd25"

RPROVIDES:${PN} += "leechcraft-azoth-nativeemoticons leechcraft-azoth-nativeemoticons(aarch-64) libleechcraft_azoth_nativeemoticons.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-azoth libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
