SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library built from sdl12_compat. \
it provides a binary and source compatible API for programs written \
against SDL 1.2, but it uses SDL 2.0 behind the scenes."
LICENSE = "MIT"

PV = "1.2.60"

RPM_NAME = "libSDL-1_2-0-1.2.60-1.7.aarch64.rpm"
RPM_HASH = "f124a1b6f5564c12a6dbc4b5caca2275d51c95e0ae4f087ca53dd022c87fb9238c84b3c4b87f6a42807e25a0a37faddf6d2c5e60f2204ae54066e5eb62d398c4"

RPROVIDES:${PN} += "libSDL-1.2.so.0()(64bit) libSDL-1_2-0 libSDL-1_2-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2_0-0 libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
