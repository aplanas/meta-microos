SUMMARY = "Portable sound event library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains the main library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra0-0.30-15.23.aarch64.rpm"
RPM_HASH = "672ce81bc88a92f61bddcbdf0f9edaaa74300d8d527892117d50bfa1b18194f1744a7ce62624e10a69a290f3514f266a8f02a1378d2e141254335464b1901ce2"

RPROVIDES:${PN} += "libcanberra-alsa.so()(64bit) libcanberra-multi.so()(64bit) libcanberra-null.so()(64bit) libcanberra-oss.so()(64bit) libcanberra-pulse.so()(64bit) libcanberra.so.0()(64bit) libcanberra.so.0(CANBERRA_0)(64bit) libcanberra0 libcanberra0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libltdl.so.7()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libpulse0 libvorbisfile.so.3()(64bit)"

inherit rpm
