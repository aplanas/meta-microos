SUMMARY = "Video Player with Plug-Ins"
DESCRIPTION = "xine is a video player with a graphical front-end that supports a large \
number of file formats (VCD and MPEG2, for example) using plug-ins. \
Several plug-ins are included. Others can be installed after xine \
installation. xine supports stereo sound using OSS and AC5.1 using \
Alsa. \
 \
 \
This version of xine may lack certain features because of legal \
requirements (potential patent violation). See also \
http://en.opensuse.org/XINE#Legal_Matters \
 \
 \
More information about xine plug-ins can be found at \
http://www.xine-project.org/home \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@sourceforge.net>"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.13"

RPM_NAME = "libxine2-1.2.13-2.2.aarch64.rpm"
RPM_HASH = "62f13a469919fa7d77ae7e361dbfcd4f614f475da08ada3e78e36df95242919f96e94885c56d111c1137cb70117af7212fafcaaae9824c252fd14e1f1f6c9e12"

RPROVIDES:${PN} += "libxine.so.2()(64bit) libxine2 libxine2(aarch-64) libxine2-dvb libxine2-syncfb libxine2-xvmc xine-lib"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libFLAC.so.12()(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libMagickWand-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXv.so.1()(64bit) libXvMCW.so.1()(64bit) liba52.so.0()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libasound.so.2(ALSA_0.9.0rc8)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdvdnav.so.4()(64bit) libfreetype.so.6()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgobject-2.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmad.so.0()(64bit) libmng.so.2()(64bit) libmodplug.so.1()(64bit) libmpcdec.so.5()(64bit) libogg.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libsmbclient.so.0()(64bit) libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) libspeex.so.1()(64bit) libtheora.so.0()(64bit) libtheora.so.0(libtheora.so.1.0)(64bit) libv4l2.so.0()(64bit) libvorbis.so.0()(64bit) libvpx.so.8()(64bit) libxcb-shape.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-xv.so.0()(64bit) libxcb.so.1()(64bit) libz.so.1()(64bit)"

inherit rpm
