SUMMARY = "X Window System initializer"
DESCRIPTION = "The xinit program is used to start the X Window System server and a \
first client program on systems that are not using a display manager \
such as xdm or in environments that use multiple window systems. \
When this first client exits, xinit will kill the X server and then \
terminate."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "xinit-1.4.2-1.2.aarch64.rpm"
RPM_HASH = "ed1fb0e355554fcf8c1509dfc9ae20f70e782ce728ff2df9ab2b865fbc72e86aac4e2c4eba4fe729d77718c2bfbc016784d95321d0b04680f5a46fece83be1f2"

RPROVIDES:${PN} += "config(xinit) \
xinit \
xinit(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
setxkbmap \
xauth \
xmodmap \
xrdb \
xsetroot \
xterm-bin"

inherit rpm
