SUMMARY = "A Compiler Tool for Generating Perfect Hash Functions"
DESCRIPTION = "A perfect hash function is simply: a hash function and a data structure \
that allows recognition of a key word in a set of words using exactly \
one probe into the data structure."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "gperf-3.1-4.5.aarch64.rpm"
RPM_HASH = "282644a1c34da27edb89d6cb5b64685806c7748a1a81334fbd324251276ee9ad54d749a580d475d8687fa79a7c2d448f7703ad58513edb3b9919fc8096bf9d38"

RPROVIDES:${PN} += "gperf gperf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
