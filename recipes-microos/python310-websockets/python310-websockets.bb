SUMMARY = "An implementation of the WebSocket Protocol (RFC 6455)"
DESCRIPTION = "WebSockets is a library for developing WebSocket servers_ and clients_ in \
Python. It implements RFC 6455 with a focus on correctness and simplicity. \
It passes the Autobahn Testsuite. \
 \
Built on top of Python's asynchronous I/O support introduced in PEP 3156, \
it provides an API based on coroutines, making it easy to write highly \
concurrent applications."
LICENSE = "BSD-3-Clause"

PV = "10.4"

RPM_NAME = "python310-websockets-10.4-2.1.aarch64.rpm"
RPM_HASH = "74f64e841ad3eae643c7f8ee56bfaae5f5707e9ade9cfce1190095f04ca21ad95b0e0c45ab90233e850797620774b6a771bec7b25b4c03828d6e354a54f2d632"

RPROVIDES:${PN} += "python3-websockets python3.10dist(websockets) python310-websockets python310-websockets(aarch-64) python3dist(websockets)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
