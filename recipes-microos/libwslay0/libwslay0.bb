SUMMARY = "WebSockets C Library"
DESCRIPTION = "Wslay is a WebSocket library written in C. It implements the protocol version \
13 described in RFC 6455. This library offers 2 levels of API: event-based API \
and frame-based low-level API. For event-based API, it is suitable for \
non-blocking reactor pattern style. You can set callbacks in various events. \
For frame-based API, you can send WebSocket frame directly. Wslay only supports \
data transfer part of WebSocket protocol and does not perform opening handshake \
in HTTP. \
 \
This package holds the shared C library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "libwslay0-1.1.1-2.8.aarch64.rpm"
RPM_HASH = "72504b6dee3f8692867027adb01ee85b14acc737f5ed7cb8427cb92f2b63dc47c9ecb0b54374ab97498568dd1d11c50daf9e5e326c6cadf290252b3cc609f4fa"

RPROVIDES:${PN} += "libwslay.so.0()(64bit) \
libwslay0 \
libwslay0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
