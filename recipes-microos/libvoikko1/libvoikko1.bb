SUMMARY = "Library of free natural language processing tools"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
The library supports multiple backends, of which VFST and HFST are \
enabled in the default build: \
 \
 - VFST: Finite state transducer format used for Finnish morphology \
   and as an experimental language independent backend. \
 - HFST (Helsinki Finite-State Transducer Technology): Supports ZHFST \
   speller archives for various languages. \
 - Experimental backends: Weighted VFST and Lttoolbox. \
 \
Libvoikko provides spell checking, hyphenation, grammar checking and \
morphological analysis for Finnish language. Spell checking is \
supported for other languages through the HFST backend."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "libvoikko1-4.3.1-1.10.aarch64.rpm"
RPM_HASH = "67fbd6aa18dd524a2c00cb320381f5d085db2c63ef1c142739f7c7db5477136135103b2dc05542aed77d3da431e71085428ea2722aa6d072f15629e56302a53b"

RPROVIDES:${PN} += "libvoikko.so.1()(64bit) \
libvoikko1 \
libvoikko1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhfstospell.so.11()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
malaga-suomi"

inherit rpm
