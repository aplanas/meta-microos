SUMMARY = "Musepack Audio Decoder"
DESCRIPTION = "Musepack is an audio compression format with a strong emphasis on high \
quality. It's not lossless, but it is designed for transparency, so \
that you won't be able to hear differences between the original wave \
file and the much smaller MPC file. \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but since 1997 it \
has rapidly developed and vastly improved and is now at an advanced \
stage in which it contains heavily optimized and patentless code. \
 \
Musepack is not particularly optimized for low bitrates. The encoder \
was designed to be transparent at the --standard setting, thus little \
low bitrate tuning has gone into the codec, opposite to that of AAC, \
Vorbis, WMA and others which focus more on this region."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "libmpcdec-devel-1.2.6-35.13.aarch64.rpm"
RPM_HASH = "f4d8a4eda9d753ed24818da0b545a018e48315281ef161200ae63b6cf2242d67a24918cc8581317521506cfd95ce47fd0831cba285ba81ed4541cbdab30db349"

RPROVIDES:${PN} += "libmpcdec-devel libmpcdec-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libmpcdec5"

inherit rpm
