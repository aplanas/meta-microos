SUMMARY = "Remote desktop protocol (RDP) server"
DESCRIPTION = "A terminal server, capable of accepting connection from rdesktop and \
Microsoft's own terminal server / remote desktop clients."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "xrdp-0.9.20-7.3.aarch64.rpm"
RPM_HASH = "9df0ba6b1be311208391af1f82e3ce7a3b292e466043954fdee08a648fa9f2598f87b5669a8444c7eb6678ff7614eedaaa58d26717dd2e3f8aa857ac90b691b9"

RPROVIDES:${PN} += "config(xrdp) libcommon.so.0()(64bit) libmc.so()(64bit) libscp.so.0()(64bit) libvnc.so()(64bit) libxrdp.so.0()(64bit) libxrdpapi.so.0()(64bit) libxup.so()(64bit) xrdp xrdp(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXfixes.so.3()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.4)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) xorg-x11-Xvnc"

inherit rpm
