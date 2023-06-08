SUMMARY = "Simple DirectMedia Layer 2 Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.20.2"

RPM_NAME = "libSDL2_ttf-2_0-0-2.20.2-1.3.aarch64.rpm"
RPM_HASH = "15e98b7439f3a1eb9b9733b6c399f35ab5e3d840f347a55606feb23f675148e0d9108bfdbc69d720997aa63b936a49d66c0935e1616650c8ad8de3848052366e"

RPROVIDES:${PN} += "SDL2_ttf libSDL2_ttf-2.0.so.0()(64bit) libSDL2_ttf-2_0-0 libSDL2_ttf-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
