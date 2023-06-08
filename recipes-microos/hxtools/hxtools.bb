SUMMARY = "Collection of day-to-day tools (binaries)"
DESCRIPTION = "A collection of various tools. Some of the important ones: \
 \
* checkbrack(1) — check parenthesis and bracket count \
* fd0ssh(1) — pipe for password-over-stdin support to ssh \
* ofl(1) — open file lister (replaces fuser and lsof -m) \
* tailhex(1) — hex dumper with tail-following support"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-20230411-1.1.aarch64.rpm"
RPM_HASH = "b688c90cd8618a41a683a6c31a298f3c9c7b80754e97cd4bc374adfbcaabf3940aee41244fe4c3c74ffaf59f77141800b406d913ced9753f6f334d5cab460c4d"

RPROVIDES:${PN} += "hxtools hxtools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh fd0ssh hxtools-scripts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHX.so.32()(64bit) libHX.so.32(LIBHX_3.25)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ofl sysinfo"

inherit rpm
