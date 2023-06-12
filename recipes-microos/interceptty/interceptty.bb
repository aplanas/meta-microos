SUMMARY = "Serial port sniffer"
DESCRIPTION = "IntercepTTY is a program that can sit between a real (or fake) \
serial port and an application, recording any communications \
between the application and the device. It can also be used as a \
network serial server or client, to provide an emulated serial port \
connected to a program, and for various other tasks."
LICENSE = "GPL-2.0-only"

PV = "0.6+git.20190731"

RPM_NAME = "interceptty-0.6+git.20190731-1.10.aarch64.rpm"
RPM_HASH = "e24a1ca8392fa6894a3782e749fcd26f25aba3ffb0f043f3bfaf602d85e2366d85a44862d21cfed5cb52301425277217962c7f56e0ffe8cf45168bb57da407b5"

RPROVIDES:${PN} += "interceptty \
interceptty(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
