SUMMARY = "The D-Bus responder of sssd"
DESCRIPTION = "Provides the D-Bus responder of sssd, called InfoPipe, which allows \
information from sssd to be transmitted over the system bus."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "sssd-dbus-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "bc4e53eb4fc8d311fb0849bd193a2b7627c920c81ff770d7c7f627bbaed5019bfd3f66c164b592b13055f95d51e3b8712170b3e53758b6d4194092309210ee2d"

RPROVIDES:${PN} += "sssd-dbus sssd-dbus(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libifp_iface.so()(64bit) libifp_iface.so(V_2.8.2)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsss_cert.so()(64bit) libsss_cert.so(V_2.8.2)(64bit) libsss_child.so()(64bit) libsss_child.so(V_2.8.2)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.8.2)(64bit) libsss_iface.so()(64bit) libsss_iface.so(V_2.8.2)(64bit) libsss_sbus.so()(64bit) libsss_sbus.so(V_2.8.2)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.8.2)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtdb.so.1()(64bit) libtdb.so.1(TDB_1.2.1)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit) sssd"

inherit rpm
