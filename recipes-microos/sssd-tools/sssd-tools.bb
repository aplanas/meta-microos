SUMMARY = "Commandline tools for sssd"
DESCRIPTION = "The packages contains commandline tools for managing users and groups using \
the 'local' id provider of the System Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-tools-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "b3039b0f66f87639be0fb3014ca3372eac7be7bc0d456dacc655611729280dce714ec70d76b3b1c7c36f15efb30237ae07a9cc6e6a224e8215490ebec0db3960"

RPROVIDES:${PN} += "sssd-tools \
sssd-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdhash.so.1()(64bit) \
libdhash.so.1(DHASH_0.4.3)(64bit) \
libifp_iface_sync.so()(64bit) \
libifp_iface_sync.so(V_2.9.0)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam_misc.so.0()(64bit) \
libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libref_array.so.1()(64bit) \
libref_array.so.1(REF_ARRAY_0.1.1)(64bit) \
libsss_certmap.so.0()(64bit) \
libsss_certmap.so.0(SSS_CERTMAP_0.0)(64bit) \
libsss_certmap.so.0(SSS_CERTMAP_0.1)(64bit) \
libsss_crypt.so()(64bit) \
libsss_crypt.so(V_2.9.0)(64bit) \
libsss_debug.so()(64bit) \
libsss_debug.so(V_2.9.0)(64bit) \
libsss_iface.so()(64bit) \
libsss_iface.so(V_2.9.0)(64bit) \
libsss_iface_sync.so()(64bit) \
libsss_iface_sync.so(V_2.9.0)(64bit) \
libsss_sbus.so()(64bit) \
libsss_sbus.so(V_2.9.0)(64bit) \
libsss_sbus_sync.so()(64bit) \
libsss_sbus_sync.so(V_2.9.0)(64bit) \
libsss_util.so()(64bit) \
libsss_util.so(V_2.9.0)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
python(abi) \
python3-sssd-config \
sssd"

inherit rpm
