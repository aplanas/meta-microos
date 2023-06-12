SUMMARY = "OpenSSH AuthorizedKeysCommand helpers"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains helper applications for OpenSSH which retrieve \
keys from various sources."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-helpers-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "9d359a070828e75895055a738090a9951cf512f12eccb2e018957f78d9d18fc4db3d14b1439e94af8164ec501e16c7692bd193d6037c141aab1221454b58d39e"

RPROVIDES:${PN} += "config(openssh-helpers) openssh-helpers openssh-helpers(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) openssh-common"

inherit rpm
