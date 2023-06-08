SUMMARY = "Commandline tools for sssd"
DESCRIPTION = "The packages contains commandline tools for managing users and groups using \
the 'local' id provider of the System Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "sssd-tools-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "a5e8f45505bd5dbaac2995101357221593e307c599da66cc9e470f37a58842e458e4c5d2a551a3bdced2f607ac2cb71345b573b849bb52b64dfd016a06ff28e9"

RPROVIDES:${PN} += "sssd-tools sssd-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libifp_iface_sync.so()(64bit) libifp_iface_sync.so(V_2.8.2)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam_misc.so.0()(64bit) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libref_array.so.1()(64bit) libref_array.so.1(REF_ARRAY_0.1.1)(64bit) libsss_certmap.so.0()(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.0)(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.1)(64bit) libsss_crypt.so()(64bit) libsss_crypt.so(V_2.8.2)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.8.2)(64bit) libsss_iface.so()(64bit) libsss_iface.so(V_2.8.2)(64bit) libsss_iface_sync.so()(64bit) libsss_iface_sync.so(V_2.8.2)(64bit) libsss_sbus.so()(64bit) libsss_sbus.so(V_2.8.2)(64bit) libsss_sbus_sync.so()(64bit) libsss_sbus_sync.so(V_2.8.2)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.8.2)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) python(abi) python3-sssd-config sssd"

inherit rpm
