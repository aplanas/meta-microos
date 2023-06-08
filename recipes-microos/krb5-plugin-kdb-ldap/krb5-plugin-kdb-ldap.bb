SUMMARY = "LDAP database plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords. This package contains the LDAP \
database plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-kdb-ldap-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "741e26e70f73a7752e8e08932c943019a498cca401c44fcb0e7f0ec0c8ccf6923833ecc50acab0e89f54aaf68871b32c5e84a8b915015f7c28b810eb20911fd4"

RPROVIDES:${PN} += "config(krb5-plugin-kdb-ldap) krb5-plugin-kdb-ldap krb5-plugin-kdb-ldap(aarch-64) libkdb_ldap.so.1()(64bit) libkdb_ldap.so.1(HIDDEN)(64bit) libkdb_ldap.so.1(kdb_ldap_1_MIT)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig krb5-server ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit) libgssrpc.so.4()(64bit) libgssrpc.so.4(gssrpc_4_MIT)(64bit) libk5crypto.so.3()(64bit) libk5crypto.so.3(k5crypto_3_MIT)(64bit) libkadm5srv_mit.so.12()(64bit) libkadm5srv_mit.so.12(kadm5srv_mit_12_MIT)(64bit) libkdb5.so.10()(64bit) libkdb5.so.10(kdb5_10_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libkrb5support.so.0()(64bit) libkrb5support.so.0(krb5support_0_MIT)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
