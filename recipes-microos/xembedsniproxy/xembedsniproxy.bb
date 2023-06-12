SUMMARY = "XEmbed SNI Proxy"
DESCRIPTION = "This package provides a proxy translating XEmbed for SNI trays. \
Can also be used by standalone tray apps."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "xembedsniproxy-5.27.5-2.4.aarch64.rpm"
RPM_HASH = "1f3b61e582fc237720c879e843505c9a2365d8265ea968d9f1f4b1b3b4d441ec0fbccc1d778001cab43212b536a64e92b24b8ce21cdc6d680d2f0034b9c69079"

RPROVIDES:${PN} += "xembed-sni-proxy \
xembedsniproxy \
xembedsniproxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-damage.so.0()(64bit) \
libxcb-image.so.0()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
