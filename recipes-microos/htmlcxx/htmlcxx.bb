SUMMARY = "HTML and CSS APIs for C++"
DESCRIPTION = "This is a simple non-validating css1 and html parser for C++. Although there are several other html parsers available, htmlcxx has some characteristics that make it unique: \
 \
- STL like navigation of DOM tree, using excelent's tree.hh library from Kasper Peeters \
- It is possible to reproduce exactly, character by character, the original document from the parse tree \
- Bundled css parser \
- Optional parsing of attributes \
- C++ code that looks like C++ (not so true anymore) \
- Offsets of tags/elements in the original document are stored in the nodes of the DOM tree"
LICENSE = "LGPL-2.0-only & Apache-2.0"

PV = "0.87"

RPM_NAME = "htmlcxx-0.87-2.8.aarch64.rpm"
RPM_HASH = "e7de0d26efaeecff6cb5b2f7d4abada89e7b8da8e6809f8cb33785df0361eb5b8e88dd0d439d14d643d41c2bfb7f655eb3dd545dd823e32052d87b5b5fa13305"

RPROVIDES:${PN} += "htmlcxx htmlcxx(aarch-64) libcss_parser.so.0()(64bit) libcss_parser_pp.so.0()(64bit) libhtmlcxx.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
