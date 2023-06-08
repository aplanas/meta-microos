SUMMARY = "Development files for libevent2"
DESCRIPTION = "The libevent API provides a mechanism to execute a callback function \
when a specific event occurs on a file descriptor or after a timeout \
has been reached. Furthermore, libevent also support callbacks due to \
signals or regular timeouts. \
 \
This package holds the development files for libevent2."
LICENSE = "BSD-3-Clause"

PV = "2.1.12"

RPM_NAME = "libevent-devel-2.1.12-3.4.aarch64.rpm"
RPM_HASH = "260ac62799a2f0153591b4fffdb04770e01d15dfaaf830bb1e812c8ee22b396f4023ee505e0d280cca126db6b5c7d09a716be791f59cca89103d011068712fda"

RPROVIDES:${PN} += "libevent-devel libevent-devel(aarch-64) libevent:/usr/include/event.h pkgconfig(libevent) pkgconfig(libevent_core) pkgconfig(libevent_extra) pkgconfig(libevent_openssl) pkgconfig(libevent_pthreads)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3 glibc-devel libevent-2_1-7 pkgconfig(libevent)"

inherit rpm
