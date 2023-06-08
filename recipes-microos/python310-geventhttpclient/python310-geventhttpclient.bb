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

PV = "2.0.8"

RPM_NAME = "python310-geventhttpclient-2.0.8-1.4.aarch64.rpm"
RPM_HASH = "c7f59f7734a0c74363b2e403eb18778c648e8e6a118918c4393f9d9c63e792cca886b9c88639159ab9f34cbb2baba79e5f5a249a63363a096729591921a7e9f7"

RPROVIDES:${PN} += "python3-geventhttpclient python3.10dist(geventhttpclient) python310-geventhttpclient python310-geventhttpclient(aarch-64) python3dist(geventhttpclient)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-Brotli python310-certifi python310-gevent"

inherit rpm
