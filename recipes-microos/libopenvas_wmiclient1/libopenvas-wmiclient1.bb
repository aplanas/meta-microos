SUMMARY = "Support libraries for GVM"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wmiclient1-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "a5f06f597be596a9668e3629f7e442e173f9a7b3868eff87f531482f579cc81f6a417c1a79e19a051a9eb20a7992ac7bf834bd802473c262de2e56f002c16dd8"

RPROVIDES:${PN} += "libopenvas_wmiclient.so.1()(64bit) \
libopenvas_wmiclient.so.1(OPENVAS_WMICLIENT)(64bit) \
libopenvas_wmiclient1 \
libopenvas_wmiclient1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasn1.so.8()(64bit) \
libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgssapi.so.3()(64bit) \
libgssapi.so.3(HEIMDAL_GSS_2.0)(64bit) \
libhdb.so.9()(64bit) \
libhdb.so.9(HEIMDAL_HDB_1.0)(64bit) \
libkrb5.so.26()(64bit) \
libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
