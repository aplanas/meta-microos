SUMMARY = "Ceph RBD client base on NBD"
DESCRIPTION = "NBD based client to map Ceph rbd images to local device"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "rbd-nbd-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "9fcdd95a4df834bf51317b0d5043b6e3e429cc290001de04694bafcc2bf4a2c65f5c217b3eac83a277b43a0f7e68f0ba8713fce6e710d111e0e01bfea7e5d1b5"

RPROVIDES:${PN} += "rbd-nbd rbd-nbd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libceph-common.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-genl-3.so.200()(64bit) libnl-genl-3.so.200(libnl_3)(64bit) librados.so.2()(64bit) librados.so.2(LIBRADOS_14.2.0)(64bit) librados2 librbd.so.1()(64bit) librbd1 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
