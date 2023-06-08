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

RPM_NAME = "openssh-server-8.9p1-9.1.aarch64.rpm"
RPM_HASH = "d81040b1e48a28c15bf6d7876d4e6cd21aae20190d953396d2db6fc63f9302492afe9330a26438cacb3ecd10424dc3644ff07f6b495fbe070b2f4043fe833056"

RPROVIDES:${PN} += "config(openssh-server) group(sshd) openssh-server openssh-server(aarch-64) openssh:/usr/sbin/sshd user(sshd)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup findutils grep ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudit.so.1()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcom_err.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfido2.so.1()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libz.so.1()(64bit) openssh-common permissions sysuser-shadow"

inherit rpm
