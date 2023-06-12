SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - ladspa plugin"
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
This package holds the ladspa plugin."
LICENSE = "GPL-3.0-only"

PV = "1.03+git1.226f03b"

RPM_NAME = "ladspa-rnnoise-1.03+git1.226f03b-1.4.aarch64.rpm"
RPM_HASH = "1c2c6a8d2976d686227ee6019ce9be5b14eb33961e1d4ddbac57cf284ecefcf8f6229148fe20b776e4ecbee0aa021ed5a97f9d7941e10e42e5ece40ee1b3ebc4"

RPROVIDES:${PN} += "ladspa-rnnoise \
ladspa-rnnoise(aarch-64) \
librnnoise_ladspa.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatomic.so.1()(64bit) \
libatomic.so.1(LIBATOMIC_1.0)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
