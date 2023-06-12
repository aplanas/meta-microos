SUMMARY = "HTTP request/response parser for C"
DESCRIPTION = "This is a parser for HTTP messages written in C. It parses both \
requests and responses. The parser is designed to be used in \
performance HTTP applications. It does not make any syscalls nor \
allocations, it does not buffer data, it can be interrupted at \
anytime. Depending on your architecture, it only requires about 40 \
bytes of data per message stream (in a web server that is per \
connection)."
LICENSE = "MIT"

PV = "2.9.4"

RPM_NAME = "libhttp_parser2_9-2.9.4-1.11.aarch64.rpm"
RPM_HASH = "b77b2d057f7e14dd04d1afae59cc07837828cda55b4cdc133e8c748ae8c4b64c7a78cb2c4f3f459060b8f0cd65ce86d366e894548e44cc4be3cf1ae7c5870a0d"

RPROVIDES:${PN} += "libhttp-parser-suse0 \
libhttp_parser.so.2.9()(64bit) \
libhttp_parser2_9 \
libhttp_parser2_9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
