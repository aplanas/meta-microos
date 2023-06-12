SUMMARY = "Libraries and Header Files to Develop Programs with tevent0 Support"
DESCRIPTION = "Tevent is an event system based on the talloc memory management library. It \
is the core event system used in Samba. \
 \
The low level tevent has support for many event types, including timers, \
signals, and the classic file descriptor events. \
 \
Tevent also provide helpers to deal with asynchronous code providing the \
tevent_req (tevent request) functions. \
 \
This package contains libraries and header files need for development."
LICENSE = "LGPL-3.0-or-later"

PV = "0.14.1"

RPM_NAME = "libtevent-devel-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "8d03b220edd8ab3e79381c5df0d12c01c7fc82187ab0c870d83ca59e7514219686cc6a76d1265aa3b9a040c47d4ccc6e6b86e8373905939418108b457534511d"

RPROVIDES:${PN} += "libtevent-devel \
libtevent-devel(aarch-64) \
pkgconfig(tevent)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtalloc-devel \
libtevent0 \
pkg-config \
pkgconfig(talloc)"

inherit rpm
