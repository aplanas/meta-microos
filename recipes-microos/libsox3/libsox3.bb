SUMMARY = "Sound Conversion Library"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "14.4.2"

RPM_NAME = "libsox3-14.4.2-6.1.aarch64.rpm"
RPM_HASH = "b91a27cade85714c6d46fcac72ba90c6018925fc6fca005c421b8584a742a52525a6cee595d2164c00c5b42fe839e1ce91b5cc2d7cfde8ca1c72fcd2231f3241"

RPROVIDES:${PN} += "libsox.so.3()(64bit) libsox3 libsox3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libao.so.4()(64bit) libao.so.4(LIBAO4_1.1.0)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgomp.so.1(OMP_3.0)(64bit) libgsm.so.1()(64bit) libid3tag.so.0.16.2()(64bit) libltdl.so.7()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmad.so.0()(64bit) libmagic.so.1()(64bit) libmp3lame.so.0()(64bit) libogg.so.0()(64bit) libopencore-amrnb.so.0()(64bit) libopencore-amrwb.so.0()(64bit) libopusfile.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libtwolame.so.0()(64bit) libvorbis.so.0()(64bit) libvorbisenc.so.2()(64bit) libvorbisfile.so.3()(64bit) libwavpack.so.1()(64bit) libz.so.1()(64bit)"

inherit rpm
