SUMMARY = "Simple DirectMedia Layer – Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.0.11"

RPM_NAME = "libSDL_ttf-2_0-0-2.0.11-7.25.aarch64.rpm"
RPM_HASH = "67daa72d8ba099242f08a582ca27347ef23b51732227e60e1d489ee18ef44fa8e98906134b8ed0a0188751846e846aa30e74a6f7796a5f8f4f88167db81d524f"

RPROVIDES:${PN} += "SDL_ttf libSDL_ttf-2.0.so.0()(64bit) libSDL_ttf-2_0-0 libSDL_ttf-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL-1.2.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libfreetype.so.6()(64bit)"

inherit rpm
