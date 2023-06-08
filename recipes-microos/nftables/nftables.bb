SUMMARY = "Userspace utility to access the nf_tables packet filter"
DESCRIPTION = "nf_tables is a firewalling mechanism in the Linux kernel, running \
independently of and parallel to ip_tables, ip6_tables, \
arp_tables and ebtables. nftables is the corresponsing userspace \
frontend. \
 \
The nftables frontend features support for sets and dictionaries of arbitrary \
types, meta data types, atomic incremental and full ruleset updates, and, \
similar to iptables, support for different protocols, access to connection \
tracking and NAT and logging."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "nftables-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "b44120282f05256dedcf45136a86e6c1420d5003e386269eceed789a4e0b78f9d99a782977e732a7bf9c61011b4019546de65b5d47df4a01717764c2e495f4fc"

RPROVIDES:${PN} += "nftables nftables(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libedit.so.0()(64bit) libnftables.so.1()(64bit) libnftables.so.1(LIBNFTABLES_1)(64bit) libnftables.so.1(LIBNFTABLES_2)(64bit) libnftables.so.1(LIBNFTABLES_3)(64bit)"

inherit rpm
