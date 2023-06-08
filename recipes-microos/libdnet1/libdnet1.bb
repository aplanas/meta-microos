SUMMARY = "Library for Portable Interface to Low-Level Networking Routines"
DESCRIPTION = "libdnet provides a portable interface to several low-level \
networking routines, including: \
* network address manipulation \
* kernel arp(4) cache and route(4) table lookup and manipulation \
* network firewalling (IP filter, ipfw, ipchains, pf, PktFilter, ...) \
* network interface lookup and manipulation \
* IP tunnelling (BSD/Linux tun, Universal TUN/TAP device) \
* raw IP packet and Ethernet frame transmission"
LICENSE = "BSD-3-Clause"

PV = "1.16.4"

RPM_NAME = "libdnet1-1.16.4-1.1.aarch64.rpm"
RPM_HASH = "67bc6e03c7e09113815bf3a0a66dd9474024f1b7ad0e8dc463ebe0b48f3c52bd519079b0c0b1265a0c0a6aa5ee3a5686c139f3f831d0eeae6edd142bed642280"

RPROVIDES:${PN} += "libdnet.so.1()(64bit) libdnet1 libdnet1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
