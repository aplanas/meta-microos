SUMMARY = "Development package for libkioarchive5"
DESCRIPTION = "This is the development package for libkioarchive"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkioarchive-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e20090fec3dddb0a6cd0569bd02b62d9363a3d701a716c3de5d2d2caaa4123574b351387b74bd02fe352f4a3965eba209c505ba32cedbe0c9b150b3651d93be2"

RPROVIDES:${PN} += "cmake(KioArchive) libkioarchive-devel libkioarchive-devel(aarch-64)"
RDEPENDS:${PN} += "libkioarchive5"

inherit rpm
