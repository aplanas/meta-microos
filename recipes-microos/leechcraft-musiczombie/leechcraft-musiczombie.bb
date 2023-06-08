SUMMARY = "LeechCraft LMP MusicBrainz.org client Module"
DESCRIPTION = "This package provides a MusicBrainz.org client plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-musiczombie-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "ddff9da4c1f8188087b478fa347903e8baf5697403c8c90328647a4d0be46609a5164ed55395ce77f852442fca17bf89187a90895b1baee27d51c6457af9e718"

RPROVIDES:${PN} += "leechcraft-musiczombie leechcraft-musiczombie(aarch-64) libleechcraft_musiczombie.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft leechcraft-lmp libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libavcodec.so.58.134()(64bit) libavcodec.so.58.134(LIBAVCODEC_58)(64bit) libavformat.so.58.76()(64bit) libavformat.so.58.76(LIBAVFORMAT_58)(64bit) libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libc.so.6(GLIBC_2.32)(64bit) libchromaprint.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
