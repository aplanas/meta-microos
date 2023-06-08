SUMMARY = "Development Files for mupdf"
DESCRIPTION = "This package contains development files needed for developing applications \
based on mupdf."
LICENSE = "AGPL-3.0-or-later"

PV = "1.21.1"

RPM_NAME = "mupdf-devel-static-1.21.1-3.3.aarch64.rpm"
RPM_HASH = "fa902e5962646dd7563cab1beb94ce803dce94ad146b18fda143e56b94f83dd1d0a6004ee9ab3cdc20489b74de9b5fa0f1c02bf24318aba39d4cf8d1c09b80a7"

RPROVIDES:${PN} += "mupdf-devel-static mupdf-devel-static(aarch-64)"
RDEPENDS:${PN} += "mupdf"

inherit rpm
