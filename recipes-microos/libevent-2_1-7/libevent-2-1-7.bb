SUMMARY = "An event notification library"
DESCRIPTION = "The libevent API provides a mechanism to execute a callback function \
when a specific event occurs on a file descriptor or after a timeout \
has been reached. Furthermore, libevent also support callbacks due to \
signals or regular timeouts. \
 \
Currently, libevent supports /dev/poll, kqueue(2), event ports, \
POSIX select(2), Windows select(), poll(2), and epoll(4). \
 \
Libevent additionally provides a sophisticated framework for buffered \
network IO, with support for sockets, filters, rate-limiting, SSL, \
zero-copy file transmission, and IOCP. Libevent includes support for \
several useful protocols, including DNS, HTTP, and a minimal RPC \
framework. \
 \
This package holds the shared libraries for libevent."
LICENSE = "BSD-3-Clause"

PV = "2.1.12"

RPM_NAME = "libevent-2_1-7-2.1.12-3.4.aarch64.rpm"
RPM_HASH = "df96f6ad963569961ce47f9efa7cb69b85d9b734a1b9758cf0ebcbda21180fedbad6a07f29d733e24b3793ebc97dbb714f3ae0b6580921f3464b658f4d3a6b43"

RPROVIDES:${PN} += "libevent \
libevent-2.1.so.7()(64bit) \
libevent-2_1-7 \
libevent-2_1-7(aarch-64) \
libevent_core-2.1.so.7()(64bit) \
libevent_extra-2.1.so.7()(64bit) \
libevent_openssl-2.1.so.7()(64bit) \
libevent_pthreads-2.1.so.7()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
