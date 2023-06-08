SUMMARY = "Development headers and libraries for http-parser"
DESCRIPTION = "This is a parser for HTTP messages written in C. It parses both \
requests and responses. The parser is designed to be used in \
performance HTTP applications. It does not make any syscalls nor \
allocations, it does not buffer data, it can be interrupted at \
anytime. Depending on your architecture, it only requires about 40 \
bytes of data per message stream (in a web server that is per \
connection). \
 \
Development headers and libraries for http-parser."
LICENSE = "MIT"

PV = "2.9.4"

RPM_NAME = "http-parser-devel-2.9.4-1.11.aarch64.rpm"
RPM_HASH = "02a1025024ab39db72f120ff1e12fbe4e942f1e57a528095f6a93ce00a4f52e0ea9dd758a65258b329af85d3acfcfbcfe58b0e6f4ce1d9f9a5079374f34b0869"

RPROVIDES:${PN} += "http-parser-devel http-parser-devel(aarch-64)"
RDEPENDS:${PN} += "libhttp_parser2_9"

inherit rpm
