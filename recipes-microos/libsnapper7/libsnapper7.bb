SUMMARY = "Library for filesystem snapshot management"
DESCRIPTION = "This package contains libsnapper, a library for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "libsnapper7-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "19277569f1ae15c9d85788d8641d93a7bd76e2cd7675a2af3c65e46270a72bac67d429834bb8ab628bcba1b03cb6d0685bca0d887f42f927b8550a25af04e175"

RPROVIDES:${PN} += "libsnapper.so.7()(64bit) \
libsnapper7 \
libsnapper7(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libbtrfs.so.0()(64bit) \
libbtrfs.so.0(LIBBTRFS_0.1)(64bit) \
libbtrfsutil.so.1()(64bit) \
libbtrfsutil.so.1(LIBBTRFSUTIL_1.1)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2.19)(64bit) \
libmount.so.1(MOUNT_2.24)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit) \
util-linux"

inherit rpm
