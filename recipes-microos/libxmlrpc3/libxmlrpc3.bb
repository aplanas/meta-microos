SUMMARY = "A library implementing XML-based remote procedure calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc3-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "190dad8b83f69208bb41713e9e70d1958bbefcbe9522f611ca9448b1a7926a3e35f4abd2e25b3b4d4363f4c8d1381188f70bbed32a98a4e205f822190c5fad6b"

RPROVIDES:${PN} += "libxmlrpc.so.3()(64bit) libxmlrpc3 libxmlrpc3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxmlrpc_util.so.4()(64bit)"

inherit rpm
