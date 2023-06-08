SUMMARY = "Video4Linux TV application (Athena)"
DESCRIPTION = "xawtv is an X11 application for watching TV with your Linux box. It supports \
video4linux devices (for example bttv cards, various USB webcams, ...). It uses \
the Athena widgets."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "xawtv-3.107-2.10.aarch64.rpm"
RPM_HASH = "1f4a486ced984ea2aaed0182bd877566bf89ffe6345689e49ca120fd0e4feeb6bafdc004425e9ed474aae7247960714c8619658b4bf872ddad89ab6f209fafb5"

RPROVIDES:${PN} += "application() application(xawtv.desktop) xawtv xawtv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXext.so.6()(64bit) libXft.so.2()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXt.so.6()(64bit) libXv.so.1()(64bit) libXxf86dga.so.1()(64bit) libXxf86vm.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontconfig.so.1()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblirc_client.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libzvbi.so.0()(64bit) tv-common tv-fonts v4l-conf"

inherit rpm
