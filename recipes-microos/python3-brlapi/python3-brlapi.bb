SUMMARY = "Library to use BRLTTY from applications -- Python Bindings"
DESCRIPTION = "BrlAPI is a service provided by the brltty daemon. \
 \
Its purpose is to allow programmers to write applications that take \
advantage of a braille terminal in order to deliver a blind user \
suitable information for his/her specific needs. \
 \
While an application communicates with the braille terminal, everything \
brltty sends to the braille terminal in the application's console is \
ignored, whereas each piece of data coming from the braille terminal is \
sent to the application, rather than to brltty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "python3-brlapi-6.5-2.3.aarch64.rpm"
RPM_HASH = "d4620a3d785a213f6e4f3536a758a0bf723d30c1cb5e71a53d86a41ec879622147aa5709c74be10ad7f303c008c460b37931b0c9af88f43b842b938ffb5b9dfd"

RPROVIDES:${PN} += "python3-brlapi python3-brlapi(aarch-64) python3.10dist(brlapi) python3dist(brlapi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.34)(64bit) python(abi)"

inherit rpm
