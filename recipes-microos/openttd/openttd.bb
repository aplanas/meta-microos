SUMMARY = "A clone of Chris Sawyer's Transport Tycoon Deluxe"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
Use package openttd-dedicated for systems without SDL."
LICENSE = "GPL-2.0-only"

PV = "13.1"

RPM_NAME = "openttd-13.1-1.1.aarch64.rpm"
RPM_HASH = "a0fdfe19760a1cd112fc56364a42d670e8ff037fdb671e15663b4d015db099e93c7912f1e1b785ba4eb580e164d5404b1ea97eb0b35dfedcd1b61abc92a6555a"

RPROVIDES:${PN} += "application() application(openttd.desktop) metainfo() metainfo(openttd.appdata.xml) openttd openttd(aarch-64) openttd-gui"
RDEPENDS:${PN} += "libSDL2-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfluidsynth.so.3()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) liblzo2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) openttd-data"

inherit rpm
