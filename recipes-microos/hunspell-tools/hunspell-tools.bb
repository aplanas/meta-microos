SUMMARY = "Hunspell tools"
DESCRIPTION = "This package contains the munch and unmunch programs."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-tools-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "1a6cabf4f08542769a8b4f2230584ee13a8e758cab2e02dc18ebc79d32d7ec4e7ea0936a9a65e0188a0c62c7e9fd91f2877619c6e9cbbf0c690bc75c586019cc"

RPROVIDES:${PN} += "hunspell-tools \
hunspell-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
hunspell \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhunspell-1.7.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
