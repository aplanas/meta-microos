SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libfdisk-devel-static-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "a242ba04602a9ac51616d0da1cb09fea2ac3fada97b4a45991d4950cfd5cba9fb4b9bc32cabb7b5e11cb30ec34f83c0a03c0dd8bcfeb72d0bf140c2e8928afe7"

RPROVIDES:${PN} += "libfdisk-devel-static libfdisk-devel-static(aarch-64)"
RDEPENDS:${PN} += "libfdisk-devel"

inherit rpm
