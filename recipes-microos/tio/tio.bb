SUMMARY = "Simple TTY terminal I/O application"
DESCRIPTION = "Tio is a simple TTY terminal application which features a straightforward \
commandline interface to easily connect to TTY devices for basic input/output."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "tio-2.5-1.2.aarch64.rpm"
RPM_HASH = "7fc2ada7eea1229c6aafada45019c5f02a90a774eb2af4ee76dc91511d8965d9c124488903baed65cd4086054abdeef96e8f12e082f30d167d9df031f94bb71f"

RPROVIDES:${PN} += "tio tio(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libinih.so.0()(64bit)"

inherit rpm
