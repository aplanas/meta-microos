SUMMARY = "Kerberos 5 API for Heimdal Kerberos"
DESCRIPTION = "This package contains the Kerberos 5 library."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkrb5-26-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "2edb03ade66a5d370ef5ffd9529ca6cc0a2982780d4ad7de6f1339855373260c74e44cb4593b1442a620d88f19a9b738c4f593567d6575e333b15b98573e4732"

RPROVIDES:${PN} += "libkrb5-26 libkrb5-26(aarch-64) libkrb5.so.26()(64bit) libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasn1.so.8()(64bit) libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libhcrypto.so.4()(64bit) libhcrypto.so.4(HEIMDAL_CRYPTO_1.0)(64bit) libheimbase.so.1()(64bit) libheimbase.so.1(HEIMDAL_BASE_1.0)(64bit) libhx509.so.5()(64bit) libhx509.so.5(HEIMDAL_X509_1.2)(64bit) libroken.so.18()(64bit) libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit) libsqlite3.so.0()(64bit) libwind.so.0()(64bit) libwind.so.0(HEIMDAL_WIND_1.0)(64bit)"

inherit rpm
