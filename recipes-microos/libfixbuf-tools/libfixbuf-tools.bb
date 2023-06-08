SUMMARY = "IPFIX file dumper"
DESCRIPTION = "libfixbuf is a compliant implementation of the IPFIX Protocol, as defined in \
RFC 5101. It supports the information model defined in RFC 5102, extended as \
proposed by RFC 5103 to support information elements for representing biflows. \
libfixbuf supports UDP, TCP, SCTP, TLS over TCP, and Spread as transport \
protocols. \
 \
ipfixDump is a command line tool for printing the contents of an IPFIX \
file as text."
LICENSE = "LGPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "libfixbuf-tools-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "ccdb6d1c9fdfa50d0dc07ba86e136f3430ee476e9b49e581ea9f08ed09619368c0922e110c5037224cb8452403d74fd9674e3f44f2f231d1de4bd2d125258578"

RPROVIDES:${PN} += "libfixbuf-tools libfixbuf-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfixbuf.so.9()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
