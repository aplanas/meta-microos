SUMMARY = "Disk Quota System"
DESCRIPTION = "The quota subsystem allows a system administrator to set soft and hard \
limits on used space and the number of inodes used for users and \
groups. The kernel must be compiled with disk quota support enabled \
(SUSE kernels have this support)."
LICENSE = "GPL-2.0-only"

PV = "4.09"

RPM_NAME = "quota-4.09-2.3.aarch64.rpm"
RPM_HASH = "103fc70d6e9432f50502d6b0d153c6ba3bba6acb78b56b2d97ff8d4d285c21e78bb1eaaf04e4c1adf808076a8f17f3cb2405fc332d56ea68d215f2bed82c0928"

RPROVIDES:${PN} += "config(quota) quota quota(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libext2fs.so.2()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-genl-3.so.200()(64bit) libnl-genl-3.so.200(libnl_3)(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit)"

inherit rpm
