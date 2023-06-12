SUMMARY = "Python bindings for libsss_nss_idmap"
DESCRIPTION = "The libsss_nss_idmap-python contains the bindings so that \
libsss_nss_idmap can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python3-sss_nss_idmap-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "0777cb56861a57492f642e2d6b8dfc53d69de7a5daf5d120089db5090814e5f2bfafac1619f214e7250052892570419c33378a2e49771f165fda7ce5194be594"

RPROVIDES:${PN} += "python3-sss_nss_idmap python3-sss_nss_idmap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsss_nss_idmap.so.0()(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.0.1)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.2.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.3.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.5.0)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.7.0)(64bit) python(abi) python3"

inherit rpm
