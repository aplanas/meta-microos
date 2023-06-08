SUMMARY = "Calculate the Replay Gain for Ogg Vorbis files"
DESCRIPTION = "Calculate the Replay Gain for Ogg Vorbis files \
 \
VorbisGain is a utility that uses a psychoacoustic method to correct \
the volume of an Ogg Vorbis file to a predefined standardized \
loudness. \
 \
It is meant as a replacement for the normalization that is commonly \
used before encoding. Although normalization will ensure that each \
song has the same peak volume, this unfortunately does not say \
anything about the apparent loudness of the music, with the end result \
being that many normalized files still don't sound equally \
loud. VorbisGain uses psychoacoustics to address this \
deficiency. Moreover, unlike normalization, it's a lossless procedure \
which works by adding tags to the file. Additionally, it will add \
hints that can be used to prevent clipping on playback. It is based \
upon the ReplayGain technology. \
 \
The end result is that playback is both more convenient and of higher \
quality compared to a non-VorbisGain'ed file."
LICENSE = "LGPL-2.1-only"

PV = "0.37"

RPM_NAME = "vorbisgain-0.37-2.13.aarch64.rpm"
RPM_HASH = "1a4a4ac2aa59959dd926d6da20f4f23b98116eea151498030806e1a838723c529b6fe1ec509f550dd08bad96c3a0bd1084248129689ca75e627a1f5c0fa613d8"

RPROVIDES:${PN} += "vorbisgain vorbisgain(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libogg.so.0()(64bit) libvorbis.so.0()(64bit) libvorbisfile.so.3()(64bit)"

inherit rpm
