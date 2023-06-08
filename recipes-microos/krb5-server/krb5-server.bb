SUMMARY = "Server program of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes the kdc, kadmind \
and more."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-server-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "b6775b827b4ec2ad56a71112bd477b82c23a08b5e8bc0d16161308e50547c790b27bfa9f4fc6dd5d00354579b0e2ad1285008682b65d35654b44f4997708ab28"

RPROVIDES:${PN} += "config(krb5-server) krb5-server krb5-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch cron fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libgssrpc.so.4()(64bit) libgssrpc.so.4(gssrpc_4_MIT)(64bit) libk5crypto.so.3()(64bit) libk5crypto.so.3(k5crypto_3_MIT)(64bit) libkadm5clnt_mit.so.12()(64bit) libkadm5clnt_mit.so.12(kadm5clnt_mit_12_MIT)(64bit) libkadm5srv_mit.so.12()(64bit) libkadm5srv_mit.so.12(kadm5srv_mit_12_MIT)(64bit) libkdb5.so.10()(64bit) libkdb5.so.10(kdb5_10_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libkrb5support.so.0()(64bit) libkrb5support.so.0(krb5support_0_MIT)(64bit) libss.so.2()(64bit) libverto-libev1 libverto.so.1()(64bit) logrotate perl-Date-Calc systemd"

inherit rpm
