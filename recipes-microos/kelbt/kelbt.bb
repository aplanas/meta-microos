SUMMARY = "Backtracking LALR(1) parser generator"
DESCRIPTION = "Kelbt generates backtracking LALR(1) parsers. Where traditional \
LALR(1) parser generators require static resolution of shift/reduce \
conflicts, Kelbt generates parsers that handle conflicts by \
backtracking at runtime. Kelbt is able to generate a parser for any \
context-free grammar that is free of hidden left recursion."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "kelbt-0.16-2.11.aarch64.rpm"
RPM_HASH = "df75b7bb07729a2e0db5459309af521fbd9fccc883621924d6c0a9bc5e7e9c8a2cecba8fcaaecf72bfe59fdf5bfb28c2acac3f9db1c0ba4f9e39e6ddf082f011"

RPROVIDES:${PN} += "kelbt \
kelbt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
