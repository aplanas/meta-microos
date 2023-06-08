SUMMARY = "Documentation for qt6-virtualkeyboard in QCH format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-virtualkeyboard-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "047ca1c0df4d9b4a221068af0fb8ce4b9b2ca1da46f489c7521a1c80935570c7df5afec996755bf5782259b469fd01c8851c6649fe175aee1fd47f5f3f8eada3"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-qch qt6-virtualkeyboard-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
