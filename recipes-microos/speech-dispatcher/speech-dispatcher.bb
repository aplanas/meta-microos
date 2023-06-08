SUMMARY = "Device independent layer for speech synthesis"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.11.4"

RPM_NAME = "speech-dispatcher-0.11.4-1.3.aarch64.rpm"
RPM_HASH = "0f166498505feef1680e674c560b86865c08b621be6e7285bcbab599c3e6296e10ab2e3f97cf0ae789d41c34b69644974eaf794897b4debf2935e0ce7f422fb7"

RPROVIDES:${PN} += "config(speech-dispatcher) speech-dispatcher speech-dispatcher(aarch-64) speechd"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libao.so.4()(64bit) libao.so.4(LIBAO4_1.1.0)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdotconf.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libltdl.so.7()(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libspeechd.so.2()(64bit) python3-speechd"

inherit rpm
