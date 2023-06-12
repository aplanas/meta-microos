SUMMARY = "Device independent layer for speech synthesis - Client library"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.4"

RPM_NAME = "libspeechd2-0.11.4-1.3.aarch64.rpm"
RPM_HASH = "fb541b34140da698e048a1e5477408899317daec09057a427e5975313d2a854d96b91d6209361f75236ce65b17c97e3ee6a4bee8e9da8f0c2a8f1549fcf86d83"

RPROVIDES:${PN} += "libspeechd.so.2()(64bit) \
libspeechd2 \
libspeechd2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
