SUMMARY = "Video4Linux TV application (Motif)"
DESCRIPTION = "motv is a X11 application for watching TV with your Linux box. It supports \
video4linux devices (for example bttv cards, various USB webcams, ...).	It's \
based on xawtv's code, but uses Motif to provide a better GUI. \
 \
Also includes the teletext/videotext viewer mtt."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "motv-3.107-2.10.aarch64.rpm"
RPM_HASH = "8d8b3d5b2daabde411782c1de292877b9f8048ae19cd73b88c1a99303bbdabc8e92e532c762cfe3c95365d13708d9828595bbc5bc46f1065bb30b2752ade6603"

RPROVIDES:${PN} += "application() application(motv.desktop) motv motv(aarch-64) xawtv:/usr/bin/motv"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXft.so.2()(64bit) libXinerama.so.1()(64bit) libXm.so.4()(64bit) libXmu.so.6()(64bit) libXpm.so.4()(64bit) libXrandr.so.2()(64bit) libXt.so.6()(64bit) libXv.so.1()(64bit) libXxf86dga.so.1()(64bit) libXxf86vm.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontconfig.so.1()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblirc_client.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libzvbi.so.0()(64bit) tv-common tv-fonts v4l-conf"

inherit rpm
