SUMMARY = "Library for supplying technical and tag information about a video or audio file"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
Information that can be retrieved: \
* General: title, author, director, album, track number, date, duration... \
* Video: codec, aspect, fps, bitrate... \
* Audio: codec, sample rate, channels, language, bitrate... \
* Text: language of subtitle \
* Chapters: number of chapters, list of chapters \
 \
DivX, XviD, H263, H.263, H264, x264, ASP, AVC, iTunes, MPEG-1, \
MPEG1, MPEG-2, MPEG2, MPEG-4, MPEG4, MP4, M4A, M4V, QuickTime, \
RealVideo, RealAudio, RA, RM, MSMPEG4v1, MSMPEG4v2, MSMPEG4v3, \
VOB, DVD, WMA, VMW, ASF, 3GP, 3GPP, 3GP2 \
 \
Container formats that are supported: \
* Video: MKV, OGM, AVI, DivX, WMV, QuickTime, Real, MPEG-1, \
  MPEG-2, MPEG-4, DVD (VOB) (Codecs: DivX, XviD, MSMPEG4, ASP, \
  H.264, AVC...) \
* Audio: OGG, MP3, WAV, RA, AC3, DTS, AAC, M4A, AU, AIFF \
* Subtitles: SRT, SSA, ASS, SAMI \
 \
This package contains the shared library for MediaInfo(-gui)."
LICENSE = "BSD-2-Clause"

PV = "23.04"

RPM_NAME = "libmediainfo0-23.04-1.1.aarch64.rpm"
RPM_HASH = "f9b7865ab6afb05274d5867cf20448051526efa95fe7a1fdfbb438b75ba6a5911bca336a56ceb5c0ffe4c5c76ee17c23046174255ac805ae8307d90434d1e027"

RPROVIDES:${PN} += "libmediainfo.so.0()(64bit) libmediainfo0 libmediainfo0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmms.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) libzen.so.0()(64bit)"

inherit rpm
