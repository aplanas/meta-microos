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

RPM_NAME = "python311-websockets-10.4-2.1.aarch64.rpm"
RPM_HASH = "638909654d5eda260e02564bfda939b5deae7362603ce33ea17ddfb15d96d1bab5ffb5db12229080eb59ee701fa6201568786419bccda767581a58c2dd5a4a8b"

RPROVIDES:${PN} += "python3.11dist(websockets) python311-websockets python311-websockets(aarch-64) python3dist(websockets)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
