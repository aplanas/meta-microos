SUMMARY = "A keepalive facility for Linux"
DESCRIPTION = "This project provides facilities for load balancing and high-availability to \
Linux system and Linux-based infrastructures. The load-balancing framework \
relies on the Linux Virtual Server (IPVS) kernel module providing Layer4 load \
balancing.  Keepalived implements a set of checkers to dynamically and \
adaptively maintain and manage loadbalanced server pool according their health. \
High-availability is achieved by the VRRP protocol, a fundamental brick for \
router failover. In addition, Keepalived implements a set of hooks to the VRRP \
finite state machine, providing low-level and high-speed protocol interactions. \
Keepalived frameworks can be used independently or all together to provide \
resilient infrastructures."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.8"

RPM_NAME = "keepalived-2.2.8-1.1.aarch64.rpm"
RPM_HASH = "69cba50d4e393ebf9bad59474f86b7fa2be0958bde94cfa5df244fa8fe8fda28028eba1af72cf99a408e9025f2b42cae64cf589f4a31d5f63ac4a936a180eb46"

RPROVIDES:${PN} += "config(keepalived) keepalived keepalived(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libmagic.so.1()(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit) libnetsnmp.so.40()(64bit) libnetsnmpagent.so.40()(64bit) libnetsnmpmibs.so.40()(64bit) libnftnl.so.11()(64bit) libnftnl.so.11(LIBNFTNL_11)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-3.so.200(libnl_3_2_27)(64bit) libnl-genl-3.so.200()(64bit) libnl-genl-3.so.200(libnl_3)(64bit) libpcre2-8.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_214)(64bit) pwdutils"

inherit rpm
