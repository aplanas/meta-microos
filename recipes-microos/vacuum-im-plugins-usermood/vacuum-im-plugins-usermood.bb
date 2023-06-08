SUMMARY = "Vacuum-IM user mood plugin"
DESCRIPTION = "Vacuum-IM plugin to send and receive information about user moods."
LICENSE = "GPL-3.0-only"

PV = "0.0.1"

RPM_NAME = "vacuum-im-plugins-usermood-0.0.1-9.23.aarch64.rpm"
RPM_HASH = "60effb559f559432d14c86c74b22be1b89841b19e88acf311bd3309c4fbb54d920c71e149112264160225c8277c4d426d974396bff864bda0fa89caa54f5e3ba"

RPROVIDES:${PN} += "libusermood.so()(64bit) vacuum-im-plugins-usermood vacuum-im-plugins-usermood(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libvacuumutils.so.37()(64bit)"

inherit rpm
