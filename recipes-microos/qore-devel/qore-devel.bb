SUMMARY = "Header files needed to compile programs using the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides header files needed to compile client programs using the \
Qore library."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-devel-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "0bcb6668bce2b60110557fff4b25a4e35e996c938ab4707f2aa7a20fbe7aace1c87345e39617abe50ecaa26c7d91a3686aa83d0e21245e76738f3667f1b96b54"

RPROVIDES:${PN} += "pkgconfig(qore) qore-devel qore-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqore12 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
