SUMMARY = "Files for Wine development"
DESCRIPTION = "This RPM contains the header files and development tools for the WINE \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "6.17"

RPM_NAME = "wine-staging-devel-6.17-1.1.aarch64.rpm"
RPM_HASH = "db1254c63d42ebf16a285522690420f3da5b2a3182f747cb7299f2acb960354f94b6e141673b8cc53cf10b240c81ccc5181e369f3ee82f58189b7939b3b1eec3"

RPROVIDES:${PN} += "wine-devel wine-staging-devel wine-staging-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFAudio.so.0()(64bit) libGL.so.1()(64bit) libOSMesa.so.8()(64bit) libSDL2-2.0.so.0()(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXcursor.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libXxf86vm.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcups.so.2()(64bit) libdbus-1.so.3()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libgcrypt.so.20()(64bit) libgnutls.so.30()(64bit) libgsm.so.1()(64bit) libgssapi_krb5.so.2()(64bit) libjpeg.so.8()(64bit) libkrb5.so.3()(64bit) libopenal.so.1()(64bit) libpng16.so.16()(64bit) libsane.so.1()(64bit) libtiff.so.5()(64bit) libv4l2.so.0()(64bit) libvkd3d-shader.so.1()(64bit) libvkd3d.so.1()(64bit) libvulkan.so.1()(64bit) libxslt.so.1()(64bit)"

inherit rpm
