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

PV = "6.3.2"

RPM_NAME = "python310-tornado6-6.3.2-1.1.aarch64.rpm"
RPM_HASH = "244d3aabefa1b06886192268b4a7b9ebb05bb00089454f82a4f90919c4ecd79d6c851eef0ddda3f48c0a23c13ddd8c69bddf7c9f88b3626f8674c8ba54b540c8"

RPROVIDES:${PN} += "python3-tornado python3-tornado-impl python3-tornado6 python3-toro python3.10dist(tornado) python310-tornado python310-tornado-impl python310-tornado6 python310-tornado6(aarch-64) python310-toro python3dist(tornado)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310"

inherit rpm
