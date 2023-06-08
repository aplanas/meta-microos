SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_util++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "c5458f4aef0e32a045e516b2f9dc7260926db41899b68537555524acf31c3101c2be57e4c2c4ca1df66217b5b2bbef2228fc0422465ffdb1135159403c8ec0dd"

RPROVIDES:${PN} += "libxmlrpc_util++.so.8()(64bit) libxmlrpc_util++8 libxmlrpc_util++8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libxmlrpc_util.so.4()(64bit)"

inherit rpm
