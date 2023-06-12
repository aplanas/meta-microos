SUMMARY = "LADI Session Handler"
DESCRIPTION = "LADI Session Handler or simply ladish is a session management system for JACK applications on GNU/Linux."
LICENSE = "AFL-2.1 & GPL-2.0-or-later"

PV = "1+git.20210227"

RPM_NAME = "ladish-1+git.20210227-3.7.aarch64.rpm"
RPM_HASH = "5dea421d5218177a196c0559d33a494cd681ef92c80eb22cfa50ea35c4a0b0cdd3e66f1cd777428e3ad7bf963170a4a5f89489016db7e129e49fead7819024ca"

RPROVIDES:${PN} += "ladish \
ladish(aarch-64) \
libalsapid.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
a2jmidid \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libexpat.so.1()(64bit) \
libjack.so.0()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
