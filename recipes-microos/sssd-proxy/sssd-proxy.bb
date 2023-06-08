SUMMARY = "The proxy backend plugin for sssd"
DESCRIPTION = "Provides the proxy back end which can be used to wrap an existing NSS \
and/or PAM modules to leverage SSSD caching."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "sssd-proxy-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "3c1cd0936647450f5e840db8e46546e582b5c92d154d05b37f254343ba04eef367a1af07cd6bd56d7e1c030d748729e467bc967592f841248472cd0754e56390"

RPROVIDES:${PN} += "libsss_proxy.so()(64bit) sssd-proxy sssd-proxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.8.2)(64bit) libsss_iface.so()(64bit) libsss_iface.so(V_2.8.2)(64bit) libsss_sbus.so()(64bit) libsss_sbus.so(V_2.8.2)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.8.2)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit)"

inherit rpm
