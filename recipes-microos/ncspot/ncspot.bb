SUMMARY = "Ncurses Spotify client"
DESCRIPTION = "Cross-platform ncurses Spotify client written in Rust, inspired \
by ncmpc and the likes."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "ncspot-0.13.2-1.1.aarch64.rpm"
RPM_HASH = "1b093b80eb8d4a103979e334aa8297071590a88d10a3d186d78053aec6cdf59cc21dc8525b9b7f76d01db67795f20e4143dd6bb00c9bccc3972848edb6270aa9"

RPROVIDES:${PN} += "application() application(ncspot.desktop) ncspot ncspot(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxcb-render.so.0()(64bit) libxcb-shape.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
