SUMMARY = "Music editor that matches the look and feel of Impulse Tracker"
DESCRIPTION = "Schism Tracker is a reimplementation of Impulse Tracker, a \
program used to create music without the requirements of \
specialized, expensive equipment, and with a unique 'finger feel' \
that is difficult to replicate in-part. The player is based on a \
modified version of the Modplug engine, with a number of \
bugfixes and changes to improve IT playback."
LICENSE = "GPL-2.0-or-later"

PV = "20221201"

RPM_NAME = "schismtracker-20221201-1.3.aarch64.rpm"
RPM_HASH = "2a1d14217595c0b438f833ae75871a2b9147b7289004eaec5494ec14ef1f71744460bd0e41a0ea51936b5f8111931ef2b7e9c44b2db6953d392da1e6dd85912c"

RPROVIDES:${PN} += "application() \
application(schism.desktop) \
application(schismtracker.desktop) \
mimehandler(audio/x-it) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-xm) \
schismtracker \
schismtracker(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libX11.so.6()(64bit) \
libXv.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
