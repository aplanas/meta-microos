SUMMARY = "A Firewire Interface library"
DESCRIPTION = "libraw1394 provides direct access to the connected 1394 buses to \
userspace. Through this library, applications can directly send to \
and receive from other nodes without requiring a kernel driver for \
the protocol in question. \
 \
libraw1394 abstracts the interface that is used to communicate with \
the kernel. It works with both the Juju stack (firewire-core.ko; \
/dev/fw*; present since Linux kernel 2.6.22) and the old Linux1394 \
(raw1394.ko; /dev/raw1394; present until 2.6.36)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libraw1394-11-2.1.2-1.11.aarch64.rpm"
RPM_HASH = "198211be89632e10b8acb0369a74dec7d5752458db94fa6e2720d97e5a8afdc794929bc68d7945cbe6193915e65a825dbb9ba9a214cbfb16a8442d36116f933c"

RPROVIDES:${PN} += "libraw1394-11 \
libraw1394-11(aarch-64) \
libraw1394.so.11()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
