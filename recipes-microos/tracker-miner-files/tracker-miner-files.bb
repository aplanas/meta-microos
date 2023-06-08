SUMMARY = "Tracker miner to index files and applications"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This package contains a miner to index files and applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "tracker-miner-files-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "cff332ae0872dfb2f5f01b6c32b15fe923a241a4546c9146ac3a9b21e62daaa032108287c362420f3190f8512b3b9ffc2df643497084bd3908d6c4e6fe4dcca1"

RPROVIDES:${PN} += "tracker-miner-files tracker-miner-files(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtracker-extract.so()(64bit) libtracker-sparql-3.0.so.0()(64bit) libupower-glib.so.3()(64bit) tracker-miners"

inherit rpm
