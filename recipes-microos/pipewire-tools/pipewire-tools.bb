SUMMARY = "The PipeWire Tools"
DESCRIPTION = "This package contains command line utilities for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-tools-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "671b7084d5a7d2ecd4727eb324fb02ae098974d284215dd8b716a2b1889841d2bb449bdfcef672e9710f85ab6b76d602d186c5623d83f55fa5358abf7c70a3d0"

RPROVIDES:${PN} += "pipewire-tools pipewire-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpipewire-0.3.so.0()(64bit) libreadline.so.8()(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
