SUMMARY = "SDL2 Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "Library containing 20+ graphics primitives (line, box, circle, polygon, etc.) for SDL2."
LICENSE = "Zlib"

PV = "1.0.4"

RPM_NAME = "libSDL2_gfx-1_0-0-1.0.4-2.7.aarch64.rpm"
RPM_HASH = "11cdee3f724a029b0758da5a1fdfeee3885929ccbdbb8a2ca5c0d037aa29751d4700c5f02c2f5ea4843a02287a74d6463afaff75204f02d6dae7c296a0bf1ed8"

RPROVIDES:${PN} += "SDL2_gfx libSDL2_gfx-1.0.so.0()(64bit) libSDL2_gfx-1_0-0 libSDL2_gfx-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
