SUMMARY = "SSH (Secure Shell) client applications"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains clients for making secure connections to Secure \
Shell servers."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-clients-8.9p1-9.1.aarch64.rpm"
RPM_HASH = "6d531342371dc34f882a42856fae31a97cf7c697f15eaae26b8011273213c2126e98b95bbd05b1181e406660c55a05a1abca99c2852a55a710e1da9575143c18"

RPROVIDES:${PN} += "openssh-clients openssh-clients(aarch-64) openssh:/usr/bin/ssh"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libedit.so.0()(64bit) libfido2.so.1()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libz.so.1()(64bit) openssh-common"

inherit rpm
