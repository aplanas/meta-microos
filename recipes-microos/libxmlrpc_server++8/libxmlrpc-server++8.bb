SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "cfe770b33ca93bd2b80b062622510731c70ade268daacf751b089502abf9a07ef88a5fbe3d43e953bbdfcd3836d6bfd1b975820b7e63fa623c6420c4236ae761"

RPROVIDES:${PN} += "libxmlrpc_server++.so.8()(64bit) libxmlrpc_server++8 libxmlrpc_server++8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libxmlrpc++.so.8()(64bit) libxmlrpc.so.3()(64bit) libxmlrpc_server.so.3()(64bit) libxmlrpc_util++.so.8()(64bit) libxmlrpc_util.so.4()(64bit)"

inherit rpm
