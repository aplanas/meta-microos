SUMMARY = "Industrial I/O tools"
DESCRIPTION = "Library for industrial I/O."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio-0.24-1.4.aarch64.rpm"
RPM_HASH = "62080166b78df2b05ef7ae2e6f744e29846c8496f59f35d8b8006e1583b334b20d1480486cf03eaf0a4c868d5c4397b894241881f1486ff32e498cdd241090a1"

RPROVIDES:${PN} += "libiio \
libiio(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libiio.so.0()(64bit) \
systemd"

inherit rpm
