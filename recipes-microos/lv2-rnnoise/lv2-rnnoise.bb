SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - lv2 plugin"
DESCRIPTION = "The plugin is meant to suppress a wide range of noise origins \
(from original paper): computer fans, office, crowd, airplane, \
car, train, construction. \
 \
From my tests mild background noise is always suppressed, \
loud sounds, like clicking of mechanical keyboard, are \
suppressed while there is no voice however they are only \
reduced in volume when voice is present. \
 \
The plugin is made to work with 1 channel and/or 2 channels \
(ladspa plugin), 16 bit, 48000 Hz audio input. \
Other sample rates may work, or not... \
 \
This package holds the lv2 plugin."
LICENSE = "GPL-3.0-only"

PV = "1.03+git1.226f03b"

RPM_NAME = "lv2-rnnoise-1.03+git1.226f03b-1.4.aarch64.rpm"
RPM_HASH = "7f10f72bda93fa174d825a0cd61c9f3519b28dcef3b6200fff435220159db27d35da611111636d2a55d4b6c21735b06377f8566cee9114db32d25f2d2ce836ea"

RPROVIDES:${PN} += "librnnoise_mono.so()(64bit) librnnoise_stereo.so()(64bit) lv2-rnnoise lv2-rnnoise(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatomic.so.1()(64bit) libatomic.so.1(LIBATOMIC_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
