SUMMARY = "PKINIT preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a PKINIT plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-preauth-pkinit-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "484c137cc9d88ac6cee5e19068136d82b0044f4dd3017986535b307036e66bbe63f3716323c25d2a6b2b186e1005b0afd46bfae4ca4046bca961ed54138d46f2"

RPROVIDES:${PN} += "krb5-plugin-preauth-pkinit krb5-plugin-preauth-pkinit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) libcom_err.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libk5crypto.so.3()(64bit) libk5crypto.so.3(k5crypto_3_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libkrb5support.so.0()(64bit) libkrb5support.so.0(krb5support_0_MIT)(64bit)"

inherit rpm
