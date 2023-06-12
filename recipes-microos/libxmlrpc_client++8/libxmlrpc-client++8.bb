SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_client++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "2adb902e31df252a35283da8ee1782c03d301187edad85e2084eea5abf759557bacd4d410e35a06b5b6133982b71ea7dee08e0570b1f0100de9d1533e128bec8"

RPROVIDES:${PN} += "libxmlrpc_client++.so.8()(64bit) \
libxmlrpc_client++8 \
libxmlrpc_client++8(aarch-64)"
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
libxmlrpc++.so.8()(64bit) \
libxmlrpc.so.3()(64bit) \
libxmlrpc_client.so.3()(64bit) \
libxmlrpc_packetsocket.so.8()(64bit) \
libxmlrpc_util++.so.8()(64bit) \
libxmlrpc_util.so.4()(64bit)"

inherit rpm
