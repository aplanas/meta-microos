SUMMARY = "An AirPlay audio player"
DESCRIPTION = "Shairport Sync is an AirPlay audio player – it plays audio streamed from iTunes, \
iOS, Apple TV and macOS devices and AirPlay sources such as Quicktime Player and \
ForkedDaapd, among others. \
 \
Audio played by a Shairport Sync-powered device stays synchronised with the \
source and hence with similar devices playing the same source. In this way, \
synchronised multi-room audio is possible for players that support it, such as \
iTunes. \
 \
Shairport Sync runs on Linux, FreeBSD and OpenBSD. It does not support AirPlay \
video or photo streaming."
LICENSE = "GPL-3.0-only"

PV = "4.2"

RPM_NAME = "shairport-sync-4.2-1.1.aarch64.rpm"
RPM_HASH = "703e614016881d6c10f940694aed6c8c1e4bc3e1e06522dcf344403a2473d911ef4b9ec653a4a21c3a9045b9517a48c7cb4fad7ed2d0f40aa1c7bebe88698bc2"

RPROVIDES:${PN} += "config(shairport-sync) shairport-sync shairport-sync(aarch-64)"
RDEPENDS:${PN} += "/bin/sh firewalld ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libasound.so.2(ALSA_0.9.0rc8)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libconfig.so.11()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libsoxr.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) shadow"

inherit rpm
