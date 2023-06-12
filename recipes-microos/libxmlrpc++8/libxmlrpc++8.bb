SUMMARY = "A library implementing XML-based remote procedure calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "ab9c8666be63c3cbfbe1a34f1dba36864263ad4bc35406513e9930311707990a224565ee5c295e130e0b75a0d76fb35d4ff34f0a66ac2a4a80f307b2bcd0a625"

RPROVIDES:${PN} += "libxmlrpc++.so.8()(64bit) \
libxmlrpc++8 \
libxmlrpc++8(aarch-64)"
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
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxmlrpc.so.3()(64bit) \
libxmlrpc_util++.so.8()(64bit) \
libxmlrpc_util.so.4()(64bit)"

inherit rpm
