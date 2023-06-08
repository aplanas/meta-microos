SUMMARY = "Universal Source Code to Formatted Text Converter"
DESCRIPTION = "A utility that converts sourcecode to HTML, XHTML, RTF, LaTeX, TeX, XML or ANSI \
escape sequences with syntax highlighting. \
It supports several programming and markup languages. \
Language descriptions are configurable and support regular expressions. \
The utility offers indentation and reformatting capabilities. \
It is easily possible to create new language definitions and colour themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.5"

RPM_NAME = "highlight-4.5-1.3.aarch64.rpm"
RPM_HASH = "6c93d78d2001f828f48b1304928ab03fce89852c564029ce6ee4cc410c01dad28a5e8dbfe150a9221a4f69ce51afb07d5d8db9391008de0da5010dfa5b4af451"

RPROVIDES:${PN} += "highlight highlight(aarch-64)"
RDEPENDS:${PN} += "highlight-common ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblua5.4.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
