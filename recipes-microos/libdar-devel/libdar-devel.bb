SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar stands for Disk ARchive and is a hardware independent backup \
solution. Dar uses catalogs (unlike tar), so it is possible to extract \
a single file without having to read the whole archive, and it is also \
possible to create incremental backups. \
 \
Dar archives can also be created, or used, via the libdar library (with \
KDar, a KDE application, for example). \
 \
This package contains the library used by Dar and KDar."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.8"

RPM_NAME = "libdar-devel-2.7.8-1.4.aarch64.rpm"
RPM_HASH = "aa9fc72739b704dd479003c8899979007598b2a47059f681a6777f936abcb1b235f7a52dec97810475e3a0da325b464abf1090694db77ba0e7ce29ff7f5c18b9"

RPROVIDES:${PN} += "libdar-devel libdar-devel(aarch-64) pkgconfig(libdar64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libdar64-6000 openssl-devel pkgconfig(bzip2) pkgconfig(zlib)"

inherit rpm
