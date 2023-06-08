SUMMARY = "Screen Saver and Locker for the X Window System"
DESCRIPTION = "The xlock utility locks your X Window System session and runs a screen \
saver until a password is entered."
LICENSE = "MIT"

PV = "5.69"

RPM_NAME = "xlockmore-5.69-3.3.aarch64.rpm"
RPM_HASH = "de23abf640274e5e97c25e24012c7309813e4b47d52bbb9d92d859d7edec64294719c5759dedf306fc2aae067b9872fd4a7a286b7d5dfde3bf59ee5543936088"

RPROVIDES:${PN} += "xlockmore xlockmore(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXinerama.so.1()(64bit) libXpm.so.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libftgl.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
