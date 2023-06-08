SUMMARY = "Development files for libcdio-paranoia"
DESCRIPTION = "The libcdio-paranoia-devel package contains libraries and header files for \
developing applications that use libcdio-paranoia."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio-paranoia-devel-10.2+2.0.1-1.8.aarch64.rpm"
RPM_HASH = "2eef5bf2a0bb2adb46715a273ff01b866f455510723d3e99995e263367804da0b2b74951134bd3224551bdbe90e7370f028a1f0b2d8ed16363dec16773dcae1a"

RPROVIDES:${PN} += "libcdio-paranoia-devel libcdio-paranoia-devel(aarch-64) pkgconfig(libcdio_cdda) pkgconfig(libcdio_paranoia)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcdio_cdda2 libcdio_paranoia2 pkgconfig(libcdio)"

inherit rpm
