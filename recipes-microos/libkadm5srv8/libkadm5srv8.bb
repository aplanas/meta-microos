SUMMARY = "Server library for Heimdal Kerberos"
DESCRIPTION = "This package contains the server library for Heimdal's kadmin program."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkadm5srv8-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "858c0876394d9d352cb560eb8da0e8749a0ca0ae5a1b80baf4a5cb63396dd8df46225f023e2f7f10684e2c40788e24bb365ddf34c115ca381dbd637b0fcc1172"

RPROVIDES:${PN} += "libkadm5srv.so.8()(64bit) \
libkadm5srv.so.8(HEIMDAL_KAMD5_SERVER_1.0)(64bit) \
libkadm5srv8 \
libkadm5srv8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libhdb.so.9()(64bit) \
libhdb.so.9(HEIMDAL_HDB_1.0)(64bit) \
libheimbase.so.1()(64bit) \
libheimbase.so.1(HEIMDAL_BASE_1.0)(64bit) \
libkrb5.so.26()(64bit) \
libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit) \
libroken.so.18()(64bit) \
libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit)"

inherit rpm
