SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.0"

RPM_NAME = "libsigc-2_0-0-2.12.0-1.1.aarch64.rpm"
RPM_HASH = "7a0c090a6fd3fb8629f928cd6bded8bbe2d23759cd811d39091ae1db603fd935b8c2efdd8b2c0edff509502788cbff7e3264b0a0be37e23822514b4496c400e4"

RPROVIDES:${PN} += "libsigc++2 libsigc-2.0.so.0()(64bit) libsigc-2_0-0 libsigc-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm
