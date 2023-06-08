SUMMARY = "Linux Audio Session Handler"
DESCRIPTION = "LASH (formerly LADCCA) is a session management system for JACK and ALSA \
audio applications on GNU/Linux. Its aim is to allow you to have many \
different audio programs running at once and to save the setup, close \
them down, then reload the setup at some other time."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "lash-0.5.4-2.11.aarch64.rpm"
RPM_HASH = "2743434cc182bd3647d306b53e105ee72f59a9861a06a1539303c3eeaf3597a6b3750d3568acd0fa47954bb7911b979bd5a4b90f32fafee4b94a90f02b10770e"

RPROVIDES:${PN} += "lash lash(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libjack.so.0()(64bit) liblash.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libreadline.so.8()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
