SUMMARY = "Ncurses Spotify client"
DESCRIPTION = "Cross-platform ncurses Spotify client written in Rust, inspired \
by ncmpc and the likes."
LICENSE = "BSD-2-Clause"

PV = "0.13.1"

RPM_NAME = "ncspot-0.13.1-1.1.aarch64.rpm"
RPM_HASH = "39be839e68457641e4f251a23ccc58130ec794b46ca72c4aa526b7eef54ad0e6046a4030c24d525f4799aa37d2888dd3083cb0973c83d23b2ab1989d99edd615"

RPROVIDES:${PN} += "application() application(ncspot.desktop) ncspot ncspot(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxcb-render.so.0()(64bit) libxcb-shape.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
