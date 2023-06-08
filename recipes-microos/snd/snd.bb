SUMMARY = "Sound File Editor"
DESCRIPTION = "Snd is a sound editor modelled loosely after Emacs and an old, \
PDP-10 sound editor named Dpysnd. It can accommodate any \
number of sounds each with any number of channels and can be customized \
and extended using guile and guile-gtk."
LICENSE = "LGPL-2.1-or-later"

PV = "23"

RPM_NAME = "snd-23-1.4.aarch64.rpm"
RPM_HASH = "5d454ebf8b0e6eefcf78bfde2952e50b1863a1084fb7d3245aecb1f5482c5dfb5008f885620d4bbea065c3e692d626ed9b3fde4c161c3dd9672c48b0cea3ca6d"

RPROVIDES:${PN} += "application() application(snd.desktop) snd snd(aarch-64)"
RDEPENDS:${PN} += "ladspa ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXm.so.4()(64bit) libXpm.so.4()(64bit) libXt.so.6()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3.so.3()(64bit) libgsl.so.27()(64bit) libgslcblas.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
