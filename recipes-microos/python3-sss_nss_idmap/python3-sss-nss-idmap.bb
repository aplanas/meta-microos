SUMMARY = "Python bindings for libsss_nss_idmap"
DESCRIPTION = "The libsss_nss_idmap-python contains the bindings so that \
libsss_nss_idmap can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "python3-sss_nss_idmap-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "9b952d871df78d610c51f003ceb6cf011d658124e90c5c10b3181a06a8adf61cd13855f82979d9d4931f02e13464432f9ff863e28044fb8aef0e8244092cd11f"

RPROVIDES:${PN} += "python3-sss_nss_idmap python3-sss_nss_idmap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsss_nss_idmap.so.0()(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.0.1)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.2.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.3.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.5.0)(64bit) python(abi) python3"

inherit rpm
