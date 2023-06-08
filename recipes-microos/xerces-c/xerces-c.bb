SUMMARY = "A Validating XML Parser"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. Xerces-C is \
faithful to the XML 1.0 recommendation and associated standards ( DOM \
1.0, DOM 2.0. SAX 1.0, SAX 2.0, Namespaces)."
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "xerces-c-3.2.4-1.4.aarch64.rpm"
RPM_HASH = "eb43d8fe6b8f1a1f652f020becff932d067b96652627b6937bf8b44b2a4a17eb9905c54c706e687df27b807d4627a5e1a0b36cbdb915dd9200264d56d298b8bd"

RPROVIDES:${PN} += "xerces-c xerces-c(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxerces-c-3.2.so()(64bit)"

inherit rpm
