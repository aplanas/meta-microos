SUMMARY = "Shared binary to play games developed with the Godot engine"
DESCRIPTION = "This package contains a godot-runner binary for the Linux X11 platform, \
which can be used to run any game developed with the Godot engine simply \
by pointing to the location of the game's data package."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "godot-runner-4.0.2-2.1.aarch64.rpm"
RPM_HASH = "7816a72cb9d8eb72974a646157557cb4e341d18e22a6278bad730ac8657066408b05a507bae4ee4d74bf45d0be7556991bf659e0076f42d106c49f2741c333b6"

RPROVIDES:${PN} += "godot-runner godot-runner(aarch-64)"
RDEPENDS:${PN} += "ca-certificates ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSPIRV.so.12()(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libXext.so.6()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libglslang.so.12()(64bit) libgraphite2.so.3()(64bit) libharfbuzz-icu.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmbedcrypto.so.7()(64bit) libmbedtls.so.14()(64bit) libmbedx509.so.1()(64bit) libminiupnpc.so.17()(64bit) libogg.so.0()(64bit) libpcre2-32.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsharpyuv.so.0()(64bit) libspeechd.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtheora.so.0()(64bit) libtheoradec.so.1()(64bit) libtheoradec.so.1(libtheoradec_1.0)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libvorbis.so.0()(64bit) libvorbisfile.so.3()(64bit) libwebp.so.7()(64bit) libwslay.so.0()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libxkbcommon.so.0(V_0.8.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit)"

inherit rpm
