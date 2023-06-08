SUMMARY = "Library for interfacing the Music Player Daemon"
DESCRIPTION = "A stable, documented, asynchronous API library for interfacing MPD (Music Player Daemon)."
LICENSE = "BSD-3-Clause"

PV = "2.20"

RPM_NAME = "libmpdclient2-2.20-1.9.aarch64.rpm"
RPM_HASH = "b87177fcac0f844e2c77e167a940ce92c95842bdd584e0eb26b0e701709f8c8730db3eaff25f152495841bf6b31426bb5c26aa46aa3a3df4ee4594e887856a55"

RPROVIDES:${PN} += "libmpdclient.so.2()(64bit) libmpdclient.so.2(libmpdclient2)(64bit) libmpdclient2 libmpdclient2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit)"

inherit rpm
