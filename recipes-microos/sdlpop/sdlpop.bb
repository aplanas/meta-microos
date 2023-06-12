SUMMARY = "An open-source port of Prince of Persia"
DESCRIPTION = "SDLPoP is an open-source port of Prince of Persia 1, \
that runs natively under Linux. It is based on the DOS \
version of the game, and uses SDL. \
 \
Run the prince executable in a path were the original \
game data files are located."
LICENSE = "GPL-3.0-only"

PV = "1.22"

RPM_NAME = "sdlpop-1.22-1.10.aarch64.rpm"
RPM_HASH = "00b28ca3f9c5aa9cb89f93e0c5d06f8ed2edffdac522dcd02485af4984c1e280b4b2828b90c8b960e2e8e8d089d1afe16455c6b302f4b7165dd68314ed51d841"

RPROVIDES:${PN} += "application() \
application(sdlpop.desktop) \
sdlpop \
sdlpop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
