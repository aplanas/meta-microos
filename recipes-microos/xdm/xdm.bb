SUMMARY = "X Display Manager"
DESCRIPTION = "Xdm manages a collection of X displays, which may be on the local host \
or remote servers."
LICENSE = "MIT"

PV = "1.1.14"

RPM_NAME = "xdm-1.1.14-3.1.aarch64.rpm"
RPM_HASH = "64a119148251291a8e5d4cb5b1ac1612834deae46b4c8b11564082e2d516c99f1c449f0d89682c8e35ada7ee664c8f28d0b2fdc49c15fd1ed98ade21e22c214a"

RPROVIDES:${PN} += "config(xdm) libXdmGreet.so()(64bit) xdm xdm(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /sbin/startproc /usr/bin/mkdir /usr/bin/pidof /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXau.so.6()(64bit) libXaw.so.7()(64bit) libXdmcp.so.6()(64bit) libXext.so.6()(64bit) libXft.so.2()(64bit) libXinerama.so.1()(64bit) libXmu.so.6()(64bit) libXpm.so.4()(64bit) libXrender.so.1()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) logrotate sessreg systemd xconsole xinit xli xmessage xrdb xset xsetroot xterm-bin"

inherit rpm
