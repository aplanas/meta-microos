SUMMARY = "Source Client for icecast Streaming Server"
DESCRIPTION = "IceS is a source client for a streaming server. The purpose of this \
client is to provide an audio stream to a streaming server such that \
one or more listeners can access the stream.  With this layout, this \
source client can be situated remotely from the icecast server."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "ices-2.0.3-1.8.aarch64.rpm"
RPM_HASH = "da6912bc30c29e4392d1a561494696a9ba43a974133b770ac8f93818e79aa79585448c582ce54fc46975786eec6226f2c6e81ace15c203f48903af5080a15ada"

RPROVIDES:${PN} += "ices \
ices(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libogg.so.0()(64bit) \
libshout.so.3()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
