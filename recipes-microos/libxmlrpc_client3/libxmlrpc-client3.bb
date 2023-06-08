SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_client3-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "8325deebdc0457a52013f0626ab211b5ca1325f1065d889f66c5250aee1a43239e4f2e554ad5ae910843d3934cf0cf46d9ba2d1a2c79b83216a9ee4e6bf594b6"

RPROVIDES:${PN} += "libxmlrpc_client.so.3()(64bit) libxmlrpc_client3 libxmlrpc_client3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl.so.4()(64bit) libxmlrpc.so.3()(64bit) libxmlrpc_util.so.4()(64bit)"

inherit rpm
