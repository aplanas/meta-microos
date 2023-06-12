SUMMARY = "Basic XML parser in C++"
DESCRIPTION = "TinyXML is a feature-bounded XML parser in C++ that can be integrated \
into other programs. \
 \
TinyXML-2 does not parse or use DTDs (Document Type Definitions) or \
XSLs (eXtensible Stylesheet Language). There are other parsers (with \
different footprints) to do such."
LICENSE = "Zlib"

PV = "9.0.0"

RPM_NAME = "libtinyxml2-9-9.0.0-1.7.aarch64.rpm"
RPM_HASH = "93fa0e1b8b27f0bb8e2712e0d4218970a1f70b417efcb95b370e77d448ef08260cea552df822dd37277ca19d227e677ca7cf8bc3afa13e5a494276710d21e7ba"

RPROVIDES:${PN} += "libtinyxml2-9 \
libtinyxml2-9(aarch-64) \
libtinyxml2.so.9()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
