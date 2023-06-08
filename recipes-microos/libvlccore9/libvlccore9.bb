SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlccore9-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "351cdb67a6fe2c4fc6637e477a505d1550ed424a23068d49cb366ebe5ae1af6cbf1afc02ae0cad51d3c96d553507fa50e99f9c25b86e4dc582738bdb55a6d1e8"

RPROVIDES:${PN} += "libvlccore.so.9()(64bit) libvlccore9 libvlccore9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
