SUMMARY = "SSH (Secure Shell) common files"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains common files for the Secure Shell server and \
clients."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-common-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "2a2230738ecbe3036307341e7b84316235bf522c9144253adc299f21f6f49d32a16c7bdaa15f6a2680368cad3b678131ee216bd888ed7c3fbf16a4dcc6936f15"

RPROVIDES:${PN} += "openssh-common \
openssh-common(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
