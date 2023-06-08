SUMMARY = "Shared libraries for Xerces-c - a validating XML parser"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. Xerces-C is \
faithful to the XML 1.0 recommendation and associated standards ( DOM \
1.0, DOM 2.0. SAX 1.0, SAX 2.0, Namespaces). \
 \
This package contains shared libraries."
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "libxerces-c-3_2-3.2.4-1.4.aarch64.rpm"
RPM_HASH = "99082c8a6629f4d8ffc03032e69225609c6eda6e32bd4b16e36e8b104d72bae4a1dc496aa28e5342c29db36a4b1eefdb7cbffa45613bbbf8cf5b3ad0ec81e96a"

RPROVIDES:${PN} += "Xerces-c libxerces-c-3.2.so()(64bit) libxerces-c-3_2 libxerces-c-3_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
