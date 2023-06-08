SUMMARY = "C++ interface of the Ham Radio Control Libraries"
DESCRIPTION = "Hamlib provides a programming interface for controlling radios and \
other shack hardware. It is a software layer, not a complete user \
application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "libhamlib++4-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "dba16fc98f8001476e1121a560bd511c283412a8b6df7301b4ed87715779da8e0a7e5b1357434c1275f33435394d2edada2064c00bb105d0e97b16858c8847ef"

RPROVIDES:${PN} += "libhamlib++.so.4()(64bit) libhamlib++4 libhamlib++4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhamlib.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
