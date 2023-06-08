SUMMARY = "Video4linux terminal / command line utilities"
DESCRIPTION = "This package includes a bunch of command line utilities: v4lctl to \
control video4linux devices; streamer to record movies; fbtv to watch \
TV on the framebuffer console; ttv to watch tv on any ttv (powered by \
aalib), webcam for capturing and uploading images, a curses radio \
application, ..."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "v4l-tools-3.107-2.10.aarch64.rpm"
RPM_HASH = "146129247e76f38f27e1fd7e735eeb913a477c63e4616fbb4ca361d187c5df3a54120397bbe695916bae30d5805942c7687aaf747b7d61db5d63d17085f4893d"

RPROVIDES:${PN} += "v4l-tools v4l-tools(aarch-64) xawtv:/usr/bin/v4lctl"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXv.so.1()(64bit) libaa.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblirc_client.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libzvbi.so.0()(64bit) tv-common v4l-conf"

inherit rpm
