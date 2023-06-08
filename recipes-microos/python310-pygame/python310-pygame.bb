SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python310-pygame-2.1.3-1.4.aarch64.rpm"
RPM_HASH = "8ab664b23ef79487ff42f6a77135819c669c299ad192166d67d4a217b3577b26d02e275953c600edb2d71906817ad7dc0203c408d6710c2d3637b20b7aa1f1e3"

RPROVIDES:${PN} += "python3-pygame python3.10dist(pygame) python310-pygame python310-pygame(aarch-64) python3dist(pygame)"
RDEPENDS:${PN} += "/usr/bin/python3 /usr/bin/python3.10 fontconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) libSDL2_image-2.0.so.0()(64bit) libSDL2_mixer-2.0.so.0()(64bit) libSDL2_ttf-2.0.so.0()(64bit) libc.so.6(GLIBC_2.33)(64bit) libfreetype.so.6()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libportmidi.so.2()(64bit) python(abi) python310-numpy"

inherit rpm
