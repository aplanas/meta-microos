SUMMARY = "SSSD's Kerberos cache manager"
DESCRIPTION = "KCM is a process that stores, tracks and manages Kerberos credential \
caches."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "sssd-kcm-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "6cba74465148a3cbe8b9deb307ef8105686d0f1a3ec0b59787d2a1f08fdf4a4fdfab51643c69489f6780ab8641f8069ff5b66ead11bc5186586ce31b2b38d003"

RPROVIDES:${PN} += "sssd-kcm sssd-kcm(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsss_child.so()(64bit) libsss_child.so(V_2.8.2)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.8.2)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.8.2)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) sssd"

inherit rpm
