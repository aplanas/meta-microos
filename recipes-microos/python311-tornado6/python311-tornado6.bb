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

RPM_NAME = "python311-tornado6-6.2-2.1.aarch64.rpm"
RPM_HASH = "dad2fd5cf058b755f29874c0c7b74675eac53a7a7a2448562f049938ab1290451dcaf128c5ec6d4d50d705b8a482ff4057a44f807c80f9a927c4b303d0e11317"

RPROVIDES:${PN} += "python3.11dist(tornado) python311-tornado python311-tornado-impl python311-tornado6 python311-tornado6(aarch-64) python311-toro python3dist(tornado)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311"

inherit rpm
