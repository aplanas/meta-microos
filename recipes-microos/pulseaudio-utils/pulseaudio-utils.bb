SUMMARY = "PulseAudio utilities"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides utilies for making use of the PulseAudio sound \
server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-utils-16.1-3.1.aarch64.rpm"
RPM_HASH = "faa88366de6e624c94a63dbacd42ffe555e7dea8fa20b318a49a2b1d54377c5e9d40730dcea6b8eddd2dfb0de31d3941e06a9eaa2ac511ae54cf6177afcb4456"

RPROVIDES:${PN} += "libpulsedsp.so()(64bit) pulseaudio-utils pulseaudio-utils(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpulse-mainloop-glib0 libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libpulse0 libpulsecommon-16.1.so()(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libxcb.so.1()(64bit) pulseaudio-daemon"

inherit rpm
