SUMMARY = "A simple thesaurus for Libreoffice"
DESCRIPTION = "MyThes is a simple thesaurus that uses a structured text data file and an \
index file with binary search to look up words and phrases and return \
information on part of speech, meanings, and synonyms."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "libmythes-1_2-0-1.2.5-1.2.aarch64.rpm"
RPM_HASH = "3dd76d3954659e90e9f1ec2a3e0821eaa31e3624e0d8190ee6a99d703675a3011a3740430337fd60ef766b99701e4d72db97e0da4767846a220fbc087ec134af"

RPROVIDES:${PN} += "libmythes-1.2.so.0()(64bit) \
libmythes-1_2-0 \
libmythes-1_2-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
