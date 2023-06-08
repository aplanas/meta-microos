SUMMARY = "Tox client"
DESCRIPTION = "Powerful Tox client that tries to follow the Tox UI mockup while running on all \
major systems."
LICENSE = "GPL-3.0-only"

PV = "1.17.6"

RPM_NAME = "qtox-1.17.6-1.8.aarch64.rpm"
RPM_HASH = "bcff3b9a77103fbbd15ff9ac9c60e1cb4c17db017ba78d4967004242ba74f648702b0da22be32b0d221a3d7a801480d1a09888d4f1210d878b42925463f9d5f8"

RPROVIDES:${PN} += "application() application(qtox.desktop) metainfo() metainfo(io.github.qtox.qTox.appdata.xml) mimehandler(application/x-tox) mimehandler(x-scheme-handler/tox) qtox qtox(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5SonnetUi.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXss.so.1()(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavdevice.so.60()(64bit) libavdevice.so.60(LIBAVDEVICE_60.1_SUSE)(64bit) libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexif.so.12()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libqrencode.so.4()(64bit) libsnore-qt5.so.0.7()(64bit) libsodium.so.23()(64bit) libsqlcipher-3.39.4.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) libtoxcore.so.2()(64bit)"

inherit rpm
