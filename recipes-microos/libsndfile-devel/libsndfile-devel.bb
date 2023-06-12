SUMMARY = "Development package for the libsndfile library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libsndfile library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libsndfile-devel-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "b5882afe54e8aaf74f56eb6f99d4a45c02f23708f8ab5806fc780490129e19b551b196f9819edfaac400bb1c102e9824cd203e606dcb0e090183c1054c6ca65b"

RPROVIDES:${PN} += "cmake(SndFile) \
libsndd \
libsndfile-devel \
libsndfile-devel(aarch-64) \
pkgconfig(sndfile)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsndfile1 \
libstdc++-devel \
pkgconfig(flac) \
pkgconfig(ogg) \
pkgconfig(opus) \
pkgconfig(speex) \
pkgconfig(vorbis) \
pkgconfig(vorbisenc)"

inherit rpm
