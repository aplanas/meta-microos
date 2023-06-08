SUMMARY = "A strictly RFC 3986 compliant URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
There is a command line tool, uriparse, which allows parsing URIs and \
show how the liburiparser splits it into components."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "0.9.7"

RPM_NAME = "uriparser-0.9.7-1.3.aarch64.rpm"
RPM_HASH = "29c86258f33fb00d0148be27cde6d5f437cedd85b463d503601cbf82eb0969753c81446430e5da30089e33b83a4749bf3ceaf2dcb100124f40ee2a5385221ad4"

RPROVIDES:${PN} += "uriparse uriparser uriparser(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liburiparser.so.1()(64bit)"

inherit rpm
