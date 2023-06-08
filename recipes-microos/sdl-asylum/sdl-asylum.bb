SUMMARY = "Asylum like game"
DESCRIPTION = "Young Sigmund has a few problems. To help him resolve his mental instability \
you must enter the surreal world of his inner mind and shut down the \
malfunctioning brain cells. \
 \
SDL Asylum is a C port of the computer game Asylum, which was written by Andy \
Southgate in 1994 for the Acorn Archimedes and is now public domain."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.3.2"

RPM_NAME = "sdl-asylum-0.3.2-3.19.aarch64.rpm"
RPM_HASH = "ddf499ce7c516e50686b806185dc4e38cb2a201e1f896e45298281181d5b3e0d82423de6ba3a641e7a59c85ecdb5ad05732df03abf9b041190ac2d6732ce25f9"

RPROVIDES:${PN} += "application() application(sdl-asylum.desktop) config(sdl-asylum) sdl-asylum sdl-asylum(aarch-64)"
RDEPENDS:${PN} += "libGL.so.1()(64bit) libGLU.so.1()(64bit) libSDL-1.2.so.0()(64bit) libSDL_mixer-1.2.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
