SUMMARY = "The proxy backend plugin for sssd"
DESCRIPTION = "Provides the proxy back end which can be used to wrap an existing NSS \
and/or PAM modules to leverage SSSD caching."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-proxy-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "3ef1c93f700f0199ad3c00842babf3be07bdec056eb0c501e32430c5fcef590b705f9baf5aa92014402acad0edc7288c68931b2735fb6aca4f66f0b623338e95"

RPROVIDES:${PN} += "libsss_proxy.so()(64bit) sssd-proxy sssd-proxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.9.0)(64bit) libsss_iface.so()(64bit) libsss_iface.so(V_2.9.0)(64bit) libsss_sbus.so()(64bit) libsss_sbus.so(V_2.9.0)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.9.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit)"

inherit rpm
