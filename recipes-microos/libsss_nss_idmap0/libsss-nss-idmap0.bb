SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libsss_nss_idmap0-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "02d17c8690e8493c4a7661295ff60f08fa958ef333488619cde46e874cdf5ad49b69bb75c952e681fdaf3e2781dcf3808308fc71a224c00310cc1b9430b77b2a"

RPROVIDES:${PN} += "libsss_nss_idmap.so.0()(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.0.1)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.1.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.2.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.3.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.4.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.5.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.6.0)(64bit) libsss_nss_idmap0 libsss_nss_idmap0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
