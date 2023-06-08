SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_abyss++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "ad06193afacb190e2282959de6abcce239227aa525458dc8e98c8eb9917c1bd419e5397c56239bacfb405d1159325a19ade53fea958ba1b8691340c03be88dcc"

RPROVIDES:${PN} += "libxmlrpc_abyss++.so.8()(64bit) libxmlrpc_abyss++8 libxmlrpc_abyss++8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxmlrpc_abyss.so.3()(64bit) libxmlrpc_util++.so.8()(64bit) libxmlrpc_util.so.4()(64bit)"

inherit rpm
