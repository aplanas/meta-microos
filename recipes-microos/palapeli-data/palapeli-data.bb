SUMMARY = "Palapeli's standard puzzle files"
DESCRIPTION = "This package contains the standard puzzle files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "palapeli-data-23.04.0-1.1.noarch.rpm"
RPM_HASH = "7acd1eb2814e68211a80f9bc5f7f0c41a34718d4bf060387f4a2dfdc3ce8c1951a3519cfabd5598348c9d9c99d50d82c1fecb3e4035a934c495121f7deb206e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(palapeli-data) palapeli-data"
RDEPENDS:${PN} += "palapeli"

inherit rpm
