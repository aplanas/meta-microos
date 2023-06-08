SUMMARY = "Userspace library for the in-kernel Netfilter ipset interface"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set."
LICENSE = "GPL-2.0-only"

PV = "7.17"

RPM_NAME = "libipset13-7.17-1.2.aarch64.rpm"
RPM_HASH = "eba032412713e287f458f8aba2bfb88cd23f77c4437c2d9f9c29a9cf692f6565d771f27d6139d8870fe3a846dd0257bbcad462cec5554127b88beb7890ffa8c9"

RPROVIDES:${PN} += "libipset.so.13()(64bit) libipset.so.13(LIBIPSET_1.0)(64bit) libipset.so.13(LIBIPSET_2.0)(64bit) libipset.so.13(LIBIPSET_3.0)(64bit) libipset.so.13(LIBIPSET_4.0)(64bit) libipset.so.13(LIBIPSET_4.1)(64bit) libipset.so.13(LIBIPSET_4.10)(64bit) libipset.so.13(LIBIPSET_4.11)(64bit) libipset.so.13(LIBIPSET_4.12)(64bit) libipset.so.13(LIBIPSET_4.2)(64bit) libipset.so.13(LIBIPSET_4.3)(64bit) libipset.so.13(LIBIPSET_4.4)(64bit) libipset.so.13(LIBIPSET_4.5)(64bit) libipset.so.13(LIBIPSET_4.6)(64bit) libipset.so.13(LIBIPSET_4.7)(64bit) libipset.so.13(LIBIPSET_4.8)(64bit) libipset.so.13(LIBIPSET_4.9)(64bit) libipset13 libipset13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit)"

inherit rpm
