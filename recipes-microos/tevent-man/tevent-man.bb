SUMMARY = "An event system based on the talloc memory management library"
DESCRIPTION = "Tevent is an event system based on the talloc memory management library. It \
is the core event system used in Samba. \
 \
The low level tevent has support for many event types, including timers, \
signals, and the classic file descriptor events. \
 \
Tevent also provide helpers to deal with asynchronous code providing the \
tevent_req (tevent request) functions."
LICENSE = "LGPL-3.0-or-later"

PV = "0.14.1"

RPM_NAME = "tevent-man-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "bbb5caefd55e0007f470cc09ab59ce61f0c3e0e05253b566c2b72f1e0fdb3afa51012b3856abfebffb2fc8aca4e041725794111541269da721b0a469468d56c3"

RPROVIDES:${PN} += "tevent-man \
tevent-man(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
