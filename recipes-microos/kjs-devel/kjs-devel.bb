SUMMARY = "KDE Javascript engine: Build Environment"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kjs-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "6f81924e960479cd831c7f66bd04885a29a806b579e210331888a5a17afc90aad108de405bd8a27478c92add50dcd03f0afd523aeb9200249f58010347d4073d"

RPROVIDES:${PN} += "cmake(KF5JS) kjs-devel kjs-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl cmake(Qt5Core) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5JS.so.5()(64bit) libKF5JS5 libKF5JSApi5 libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
