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

RPM_NAME = "python311-geventhttpclient-2.0.8-1.4.aarch64.rpm"
RPM_HASH = "7d000a7520555fc9e99dcd3dd1fe06ca494faa2e0daeaf0bc1c20e8fd69dd340ddcb00705c4ebb188beec7c5c32569fe0e1628b34780583a6da6be475a914ecd"

RPROVIDES:${PN} += "python3.11dist(geventhttpclient) python311-geventhttpclient python311-geventhttpclient(aarch-64) python3dist(geventhttpclient)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-Brotli python311-certifi python311-gevent"

inherit rpm
