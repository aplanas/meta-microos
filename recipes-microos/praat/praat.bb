SUMMARY = "Phonetics by computer"
DESCRIPTION = "Praat is an open-software tool for the analysis of speech in phonetics. \
Through its graphical interface, several speech analysis functionalities \
are available: spectrograms, cochleograms, and pitch and formant extraction. \
Articulatory synthesis, as well as synthesis from pitch, formant, and \
intensity are also available. Other features are segmentation, labelling \
using the phonetic alphabet, and computation of statistics. \
Praat is configurable and extensible through its own scripting language and has \
provisions for communicating with other programs."
LICENSE = "GPL-3.0-or-later"

PV = "6.3.09"

RPM_NAME = "praat-6.3.09-1.3.aarch64.rpm"
RPM_HASH = "308fd3baf21f44ccb9521ed742ddeb4df3bec7cc06055b603519fb668806d96a59977d39bf905fc631ee7ba9dfef7b5d064812873fe897fb4278413dc49301d6"

RPROVIDES:${PN} += "application() application(praat.desktop) mimehandler(text/praat-pitch) mimehandler(text/praat-textgrid) praat praat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libglpk.so.40()(64bit) libgobject-2.0.so.0()(64bit) libgsl.so.27()(64bit) libgslcblas.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libogg.so.0()(64bit) libopusfile.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libvorbis.so.0()(64bit) libvorbisfile.so.3()(64bit)"

inherit rpm
