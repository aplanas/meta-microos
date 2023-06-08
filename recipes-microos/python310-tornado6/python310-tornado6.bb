SUMMARY = "Open source version of scalable, non-blocking web server that power FriendFeed"
DESCRIPTION = "Tornado is an open source version of the scalable, non-blocking web server and \
tools that power FriendFeed. The FriendFeed application is written using a web \
framework that looks a bit like web.py or Google's webapp, but with additional \
tools and optimizations to take advantage of the underlying non-blocking \
infrastructure. \
 \
The framework is distinct from most mainstream web server frameworks (and \
certainly most Python frameworks) because it is non-blocking and reasonably \
fast. Because it is non-blocking and uses epoll, it can handle thousands of \
simultaneous standing connections, which means it is ideal for real-time web \
services. We built the web server specifically to handle FriendFeed's real-time \
features — every active user of FriendFeed maintains an open connection to the \
FriendFeed servers. (For more information on scaling servers to support \
thousands of clients, see The C10K problem.)"
LICENSE = "Apache-2.0"

PV = "6.2"

RPM_NAME = "python310-tornado6-6.2-2.1.aarch64.rpm"
RPM_HASH = "c19a8505210fa96d12141ac6c6ac757feb8685642e2f4215d5e2cf932521db1653c667c790d45807f95fa50a5a8aa9fbf3ad5aa62257696d4c0c8e2367a287bb"

RPROVIDES:${PN} += "python3-tornado python3-tornado-impl python3-tornado6 python3-toro python3.10dist(tornado) python310-tornado python310-tornado-impl python310-tornado6 python310-tornado6(aarch-64) python310-toro python3dist(tornado)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310"

inherit rpm
