SUMMARY = "XEmbed SNI Proxy"
DESCRIPTION = "This package provides a proxy translating XEmbed for SNI trays. \
Can also be used by standalone tray apps."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4.1"

RPM_NAME = "xembedsniproxy-5.27.4.1-2.2.aarch64.rpm"
RPM_HASH = "7e3aa6620dbdce498b8821f333d383bfc64c2cc6e96c1cb0f0076c2f7f88621f9d558cdae224cb2d7935413b7cc8bb38d7e656cb4227257accc48e37933c8b2e"

RPROVIDES:${PN} += "xembed-sni-proxy xembedsniproxy xembedsniproxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxcb-composite.so.0()(64bit) libxcb-damage.so.0()(64bit) libxcb-image.so.0()(64bit) libxcb-shape.so.0()(64bit) libxcb-util.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
