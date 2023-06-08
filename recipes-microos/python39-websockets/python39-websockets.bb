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

RPM_NAME = "python39-websockets-10.4-2.1.aarch64.rpm"
RPM_HASH = "250a4aa17121742039325933f932da43707783c89c55ebbdcb5f928ba01aa27b0607eefccb314b9ecd7b44422fc2c8bc0a87464aa033abe48f6fc16a07ed7833"

RPROVIDES:${PN} += "python3.9dist(websockets) python39-websockets python39-websockets(aarch-64) python3dist(websockets)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
