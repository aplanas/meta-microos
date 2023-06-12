SUMMARY = "Tools for libpinyin"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This package provides the tools used to make data files."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin-tools-2.8.1-1.3.aarch64.rpm"
RPM_HASH = "1067c3bc000c24093edf873fe3b4ea1c8dd638640d272de667acf15c3fe84e9709e34f544940db48ff5304d90721188339c6368b8350b0d7e46e6b413f6c9b07"

RPROVIDES:${PN} += "libpinyin-tools \
libpinyin-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libkyotocabinet.so.16()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
