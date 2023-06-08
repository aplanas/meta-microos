SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python311-pygame-2.1.3-1.4.aarch64.rpm"
RPM_HASH = "82c513d789bacb1306f962f14b00781ed6dac65db17feed5eb0bcdbaad3900c7fa2fe6f5c55dad53e605be50a96b140f26a20f57e70b1a4e127f7a7cdc7e617a"

RPROVIDES:${PN} += "python3.11dist(pygame) python311-pygame python311-pygame(aarch-64) python3dist(pygame)"
RDEPENDS:${PN} += "/usr/bin/python3 /usr/bin/python3.11 fontconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) libSDL2_image-2.0.so.0()(64bit) libSDL2_mixer-2.0.so.0()(64bit) libSDL2_ttf-2.0.so.0()(64bit) libc.so.6(GLIBC_2.33)(64bit) libfreetype.so.6()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libportmidi.so.2()(64bit) python(abi) python311-numpy"

inherit rpm
