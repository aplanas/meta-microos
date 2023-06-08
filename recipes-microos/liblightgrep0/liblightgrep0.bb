SUMMARY = "Multipattern regular expression searching for digital forensics"
DESCRIPTION = "liblightgrep is a regular expression engine designed \
for digital forensics. \
 \
* it searches for many patterns simultaneously, \
* searches binary data as a stream, not as discrete lines of text, \
* searches for patterns in many different encodings, \
* is a forward-looking only engine"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "liblightgrep0-1.4-5.33.aarch64.rpm"
RPM_HASH = "f894c56ae5f8b83133115ee3cb31e1174ff12a6122b598010dd7dc49b701f9caad8ba768ce719986d8e8fcf68bc4c0be0e5f574c1075c85b79d6072ee5bfaf5c"

RPROVIDES:${PN} += "liblightgrep.so.0()(64bit) liblightgrep0 liblightgrep0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
