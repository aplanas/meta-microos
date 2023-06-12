SUMMARY = "HTTP client library for gevent"
DESCRIPTION = "A concurrent HTTP client library for Python using gevent. \
 \
geventhttpclient uses a HTTP parser, written in C, originating from \
nginx, extracted and modified by Joyent. \
 \
geventhttpclient has been designed for high concurrency and \
streaming, and supports HTTP/1.1 persistent connections. More \
generally, it is designed for pulling from REST APIs and streaming \
APIs like Twitter's."
LICENSE = "MIT"

PV = "2.0.9"

RPM_NAME = "python310-geventhttpclient-2.0.9-1.1.aarch64.rpm"
RPM_HASH = "8729d35f667cea66cc608538eefa921aa0dc5583a2b9e75440defb96d63d2ec4781e9d6ee68375674b58d8c72fc771ec43a9e6bd8df1a8df9c512eb32285f254"

RPROVIDES:${PN} += "python3-geventhttpclient python3.10dist(geventhttpclient) python310-geventhttpclient python310-geventhttpclient(aarch-64) python3dist(geventhttpclient)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-Brotli python310-certifi python310-gevent"

inherit rpm
