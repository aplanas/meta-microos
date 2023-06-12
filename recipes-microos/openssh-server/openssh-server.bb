SUMMARY = "SSH (Secure Shell) server"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains the Secure Shell daemon, which allows clients to \
securely connect to your server."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-server-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "6144238145909aec55b17df0611043e0d565fe40187328ce37375961df1bf6d13ad2e8ab16c59166ef93ce948e7f67963b5be8c6f50c93ada6b355e99eab7cad"

RPROVIDES:${PN} += "config(openssh-server) group(sshd) openssh-server openssh-server(aarch-64) openssh:/usr/sbin/sshd user(sshd)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup findutils grep ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudit.so.1()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcom_err.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfido2.so.1()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libz.so.1()(64bit) openssh-common permissions sysuser-shadow"

inherit rpm
