SUMMARY = "Userspace library to access the nftables Netlink interface"
DESCRIPTION = "libnftnl is a userspace library providing a low-level netlink \
programming interface (API) to the in-kernel nf_tables subsystem."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "libnftnl11-1.2.5-1.2.aarch64.rpm"
RPM_HASH = "782628109b56e543d3438dd9590c4ece2c69af9f951fac075a496cbe82dbd697871c894b47f86c20e9f139db1ed2df2ae12f6942e8c5c6a24feea219c88280fa"

RPROVIDES:${PN} += "libnftnl.so.11()(64bit) libnftnl.so.11(LIBNFTNL_11)(64bit) libnftnl.so.11(LIBNFTNL_12)(64bit) libnftnl.so.11(LIBNFTNL_13)(64bit) libnftnl.so.11(LIBNFTNL_14)(64bit) libnftnl.so.11(LIBNFTNL_15)(64bit) libnftnl.so.11(LIBNFTNL_16)(64bit) libnftnl.so.11(LIBNFTNL_17)(64bit) libnftnl11 libnftnl11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit)"

inherit rpm
