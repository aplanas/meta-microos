SUMMARY = "Open Cubic Player for MOD/S3M/XM/IT/MIDI music files"
DESCRIPTION = "Open Cubic Player is a music file player ported from DOS that supports \
Amiga MOD module formats and many variants, such as MTM, STM, 669, \
S3M, XM, and IT.  It is also able to render MIDI files using sound \
patches and play SID, OGG Vorbis, FLAC, and WAV files.  OCP provides a \
nice text-based interface with several text-based and graphical \
visualizations."
LICENSE = "GPL-2.0-or-later & CC-BY-3.0"

PV = "0.2.103"

RPM_NAME = "ocp-0.2.103-1.3.aarch64.rpm"
RPM_HASH = "a1141c1049d203b1ba8ac8a47bc04b50e5131cb120da3039f7a1b81598d68106ab20898b3a6ef6e1ae7a409d6d0a3e2697815fc9c0df1e3d1ec6447d0a9797a9"

RPROVIDES:${PN} += "application() application(cubic.org-opencubicplayer.desktop) bundled(adplug) bundled(adplugdb) bundled(libbinio) bundled(libsidplayfp) bundled(timidity++) libocp.so()(64bit) mimehandler(audio/flac) mimehandler(audio/mp2) mimehandler(audio/mpeg) mimehandler(audio/ogg) mimehandler(audio/prs.sid) mimehandler(audio/x-ams) mimehandler(audio/x-ay) mimehandler(audio/x-dmf) mimehandler(audio/x-flac) mimehandler(audio/x-flac+ogg) mimehandler(audio/x-it) mimehandler(audio/x-mdl) mimehandler(audio/x-midi) mimehandler(audio/x-mod) mimehandler(audio/x-oggflac) mimehandler(audio/x-okt) mimehandler(audio/x-ptm) mimehandler(audio/x-s3m) mimehandler(audio/x-stm) mimehandler(audio/x-vorbis+ogg) mimehandler(audio/x-wav) mimehandler(audio/x-xm) ocp ocp(aarch-64) opencubicplayer"
RDEPENDS:${PN} += "/bin/sh gnu-unifont-otf-fonts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXpm.so.4()(64bit) libXxf86vm.so.1()(64bit) libancient.so.2()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcjson.so.1()(64bit) libdiscid.so.0()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmad.so.0()(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libvorbisfile.so.3()(64bit) libz.so.1()(64bit)"

inherit rpm
