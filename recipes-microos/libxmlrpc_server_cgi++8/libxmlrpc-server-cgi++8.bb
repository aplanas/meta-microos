SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_cgi++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "730d7d41a8bbfd95bb51c5f654726359eeed4a1390fc9cc0deaf8b7333bf319ad4408dce1078ca6fae3ad1e73e1a6b170b00b0635842b252713e8bc5ad282808"

RPROVIDES:${PN} += "libxmlrpc_server_cgi++.so.8()(64bit) \
libxmlrpc_server_cgi++8 \
libxmlrpc_server_cgi++8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libxmlrpc++.so.8()(64bit) \
libxmlrpc.so.3()(64bit) \
libxmlrpc_server++.so.8()(64bit) \
libxmlrpc_util++.so.8()(64bit)"

inherit rpm
