SUMMARY = "Apache XML security C++ library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "libxml-security-c20-2.0.4-1.9.aarch64.rpm"
RPM_HASH = "caacb4764c6c0801fdca0b44f1fecd1a986fd2e06696ae74deae5392c37619eb63bf9759af84c414194d6daa95710f59c9f8788f885dac59f32dd632122a096c"

RPROVIDES:${PN} += "libxml-security-c.so.20()(64bit) libxml-security-c20 libxml-security-c20(aarch-64) xml-security-c"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxalan-c.so.112()(64bit) libxerces-c-3.2.so()(64bit)"

inherit rpm
