SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python310-pygame-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "f680d4ef36af37f62fefcd580edd1409c65b0982d53b52bb93ade23f35352d15bc562154d8766c9b7e306b0bbd4fe7bace860ed7aaf759dc30c4b7794a9781fd"

RPROVIDES:${PN} += "python3-pygame \
python3.10dist(pygame) \
python310-pygame \
python310-pygame(aarch-64) \
python3dist(pygame)"
RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.10 \
fontconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libfreetype.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libportmidi.so.2()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
