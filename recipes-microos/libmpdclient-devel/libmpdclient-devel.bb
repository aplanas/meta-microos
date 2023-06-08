SUMMARY = "Development files for libmpdclient"
DESCRIPTION = "This package contains the development files, e.g. header-files, for \
libmpdclient - a stable, documented and asynchronous API library for \
MPD (Music Player Daemon)."
LICENSE = "BSD-3-Clause"

PV = "2.20"

RPM_NAME = "libmpdclient-devel-2.20-1.9.aarch64.rpm"
RPM_HASH = "719091de0bd65097fbf7abb6cc62424c45373280a54fcd009093ce65d8493fbe35f414d4c5ce77c39c308e2b7660c9b54f2756eec55f1ae7bdfafffc2864e6f7"

RPROVIDES:${PN} += "libmpdclient-devel libmpdclient-devel(aarch-64) pkgconfig(libmpdclient)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmpdclient2"

inherit rpm
