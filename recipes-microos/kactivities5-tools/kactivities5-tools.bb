SUMMARY = "Command-line tools for Plasma Activity management"
DESCRIPTION = "This package provides command-line tools to manipulate Plasma Activities."
LICENSE = "GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kactivities5-tools-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "1530b4989d53b2141aafe44d53d11c12fe945b1b7389a68425cb5257b5505d8c8b28c0592600c930850497e8ea1bf2f767d314c2ddba850876e64bdcad5f0bd2"

RPROVIDES:${PN} += "kactivities5-tools kactivities5-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5Activities5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
