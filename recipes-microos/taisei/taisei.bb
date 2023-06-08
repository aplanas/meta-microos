SUMMARY = "Clone of the Touhou Project series of shoot ’em up games"
DESCRIPTION = "Taisei is an open clone of the Touhou Project series. Touhou is a one-man project \
of shoot ’em up games set in an isolated world full of Japanese folklore."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "taisei-1.3.2-2.12.aarch64.rpm"
RPM_HASH = "393fca590210a2f95762e478e43674190f1be4b745381867a98076077fbd960c5813deb83b22baf38e1977e2a95bd33142d574d2b62cc636f3457c66980aee3d"

RPROVIDES:${PN} += "application() application(taisei-replay-viewer.desktop) application(taisei.desktop) mimehandler(application/x-taisei-replay) taisei taisei(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) libSDL2_mixer-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopusfile.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libshaderc_shared.so.1()(64bit) libspirv-cross-c-shared.so.0()(64bit) libwebpdecoder.so.3()(64bit) libz.so.1()(64bit) libzip.so.5()(64bit) taisei-data"

inherit rpm
