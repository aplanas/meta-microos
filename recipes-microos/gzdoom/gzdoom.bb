SUMMARY = "A DOOM source port with graphic and modding extensions"
DESCRIPTION = "GZDoom is a port (a modification) of the original Doom source code, featuring: \
* an OpenGL renderer, HQnX/xBRZ rescaling, 3D floor and model support \
* Truecolor software rendering, extending the classic 8-bit palette \
* Heretic, Hexen and Strife game modes and support for a lot of \
  additional IWADs. \
* Boom and Hexen map extension support, scriptability with ACS and \
  ZScript, and various modding features regarding actors and scenery. \
* Demo record/playback of classic and Boom demos is not supported. \
 \
The executables hard-require SSE2 on i686 currently."
LICENSE = "GPL-3.0-only"

PV = "4.10.0"

RPM_NAME = "gzdoom-4.10.0-3.1.aarch64.rpm"
RPM_HASH = "0d3991712e599d106f6ee53c47ccd63103c1913abf640931474fe30f56dc7564ae79c6da532812c7fd14236b0f273d42396418deed98d4e87cae56257acdaea1"

RPROVIDES:${PN} += "bundled(gdtoa) bundled(re2c) bundled(xbrz) gzdoom gzdoom(aarch-64) qzdoom zdoom"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) libSPIRV.so.12()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libclzma-suse.so.0()(64bit) libdiscord-rpc.so.3.4.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libglslang.so.12()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libvpx.so.8()(64bit) libz.so.1()(64bit) libzmusic.so.1()(64bit)"

inherit rpm
