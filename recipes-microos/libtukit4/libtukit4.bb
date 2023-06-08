SUMMARY = "Library for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "This package contains the libraries required for programs to do \
transactional updates using btrfs snapshots."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.5"

RPM_NAME = "libtukit4-4.1.5-1.1.aarch64.rpm"
RPM_HASH = "a1707ac7d332a311b0290e6e99b09cfa559a2c24b7efb0ef23e4fc229dde4244c4bbf4c04b230f997f94d453d20d93e721389915168f21ef592bf0bff2e108e3"

RPROVIDES:${PN} += "libtukit.so.4()(64bit) libtukit4 libtukit4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig btrfsprogs ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libeconf.so.0()(64bit) libeconf.so.0(LIBECONF_0.2)(64bit) libeconf.so.0(LIBECONF_ALPHA)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.24)(64bit) libmount.so.1(MOUNT_2.30)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) rsync snapper"

inherit rpm
