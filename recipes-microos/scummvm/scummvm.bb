SUMMARY = "Interpreter for several adventure games"
DESCRIPTION = "ScummVM is an interpreter that will play graphic adventure games written for \
LucasArts' SCUMM virtual machine (such as Day of the Tentacle and \
Monkey Island), Sierra's AGI adventures (such as early King's Quest and \
Space Quest games), Adventure Soft's Simon the Sorcerer 1, 2 and Feeble Files, \
Revolution Software's Beneath a Steel Sky and Broken Sword 1, 2 and 2.5, \
Interactive Binary Illusions' Flight of the Amazon Queen, \
Coktel Vision's Gobliiins, Wyrmkeep's Inherit the Earth, Westwood's \
Legend of Kyrandia, and various others."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "scummvm-2.7.0-2.3.aarch64.rpm"
RPM_HASH = "226febd7409ad93653420c2eda1ce820d745ad3726724a66782018d4c6853fa721e1e3f29ecb5164f73345b8e06d2c13e349202c74bc25d4557451201166d7ec"

RPROVIDES:${PN} += "application() application(scummvm.desktop) metainfo() metainfo(scummvm.appdata.xml) scummvm scummvm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.14)(64bit) libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2_net-2.0.so.0()(64bit) liba52.so.0()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libdiscord-rpc.so.3.4.0()(64bit) libfluidsynth.so.3()(64bit) libfreetype.so.6()(64bit) libfribidi.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgif.so.7()(64bit) libieee1284.so.3()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmad.so.0()(64bit) libmpeg2.so.0()(64bit) libogg.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libspeechd.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtheoradec.so.1()(64bit) libtheoradec.so.1(libtheoradec_1.0)(64bit) libvorbis.so.0()(64bit) libvorbisfile.so.3()(64bit) libz.so.1()(64bit)"

inherit rpm
