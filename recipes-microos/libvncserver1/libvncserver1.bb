SUMMARY = "Library implementing a VNC server"
DESCRIPTION = "LibVNCServer/LibVNCClient are cross-platform C libraries that allow \
implementing VNC server or client functionality in your program."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.13"

RPM_NAME = "libvncserver1-0.9.13-4.4.aarch64.rpm"
RPM_HASH = "96f8ba4f46bcfee367f593cf0db1574e9c5ea1b34eeb83d5e3400292193efe702facde82cbdc687c45ed39ea3efad82f624d14cb296f5c4c36924f4b289dac91"

RPROVIDES:${PN} += "libvncserver.so.1()(64bit) libvncserver1 libvncserver1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblzo2.so.2()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libz.so.1()(64bit)"

inherit rpm
