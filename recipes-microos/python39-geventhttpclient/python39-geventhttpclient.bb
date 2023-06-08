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

RPM_NAME = "python39-geventhttpclient-2.0.8-1.4.aarch64.rpm"
RPM_HASH = "7f7cbabe7557260efc264839ba30f0ab190397a2e07cb9046bfe01c332c3d00bd55dd3364dc3589d3819679e056c14f9f99fac927db3cd49c8cbe18c6e7dad01"

RPROVIDES:${PN} += "python3.9dist(geventhttpclient) python39-geventhttpclient python39-geventhttpclient(aarch-64) python3dist(geventhttpclient)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-Brotli python39-certifi python39-gevent"

inherit rpm
