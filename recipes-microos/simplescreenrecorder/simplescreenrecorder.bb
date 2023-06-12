SUMMARY = "A feature-rich screen recorder that supports X11 and OpenGL"
DESCRIPTION = "SimpleScreenRecorder is a Linux program that was created to record programs \
and games. \
 \
The original goal was to create a program that was just really simple to \
use, the result is actually a pretty powerful program. It's 'simple' in \
the sense that it's easier to use than ffmpeg/avconv or VLC, because it \
has a straightforward user interface. \
 \
Features: \
 * Graphical user interface (Qt-based). \
 * Faster than VLC and ffmpeg/avconv. \
 * Records the entire screen or part of it, or records OpenGL applications \
   directly (similar to Fraps on Windows). \
 * Synchronizes audio and video properly (a common issue with VLC and \
   ffmpeg/avconv). \
 * Reduces the video frame rate if your computer is too slow (rather than \
   using up all your RAM like VLC does). \
 * Fully multithreaded: small delays in any of the components will never \
   block the other components, resulting is smoother video and better \
   performance on computers with multiple processors. \
 * Pause and resume recording at any time (either by clicking a button or by \
   pressing a hotkey). \
 * Shows statistics during recording (file size, bit rate, total recording \
   time, actual frame rate, ...). \
 * Can show a preview during recording, so you don't waste time recording \
   something only to figure out afterwards that some setting was wrong. \
 * Uses libav/ffmpeg libraries for encoding, so it supports many different \
   codecs and file formats (adding more is trivial). \
 * Sensible default settings: no need to change anything if you don't want to. \
 * Tooltips for almost everything: no need to read the documentation to find \
   out what something does."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "simplescreenrecorder-0.4.4-2.7.aarch64.rpm"
RPM_HASH = "1425a40a42dcc1df798ee0669bafe7a7082a9ba43134154808b83076be6e21999cc224b2aeb17b428f601cdcb6d887c6af2f69a3f5c466dc26a362f3f701fbfa"

RPROVIDES:${PN} += "application() \
application(simplescreenrecorder.desktop) \
metainfo() \
metainfo(simplescreenrecorder.metainfo.xml) \
simplescreenrecorder \
simplescreenrecorder(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) \
libv4l2.so.0()(64bit)"

inherit rpm
