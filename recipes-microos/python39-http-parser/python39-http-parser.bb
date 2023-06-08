SUMMARY = "HTTP Request/Response Parser for Python in C"
DESCRIPTION = "HTTP request/response parser for Python in C, based on \
http-parser from Ryan Dahl."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-http-parser-0.9.0-1.16.aarch64.rpm"
RPM_HASH = "90a3b0ce2144b6d3682730cbcbb221e8270336144b1ef233a9e59bba611caee9d9ce3b58ff429e444026cde62ba4f3083aa9e6ea8829651d6ae87404928e176a"

RPROVIDES:${PN} += "python3.9dist(http-parser) python39-http-parser python39-http-parser(aarch-64) python3dist(http-parser)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
