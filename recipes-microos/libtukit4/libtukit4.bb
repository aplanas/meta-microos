SUMMARY = "Library for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "This package contains the libraries required for programs to do \
transactional updates using btrfs snapshots."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.1"

RPM_NAME = "libtukit4-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "aca5a079308dd20526991077e2da87e50bdf41ab89b5d1ac234cd3eea82a9b0eaf5e3dfe4a1b84b057a5fb6e327b1e9263b01b65fad93c9eed8ee6b265d59c5a"

RPROVIDES:${PN} += "libtukit.so.4()(64bit) libtukit4 libtukit4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig btrfsprogs ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libeconf.so.0()(64bit) libeconf.so.0(LIBECONF_0.2)(64bit) libeconf.so.0(LIBECONF_ALPHA)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.24)(64bit) libmount.so.1(MOUNT_2.30)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) rsync snapper"

inherit rpm
