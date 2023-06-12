SUMMARY = "Development headers for libKPimAddressbookImportExport"
DESCRIPTION = "This package includes development headers needed to develop and build import/export plugins \
for KAddressbook."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AddressbookImportExport5-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "410480f4bffe3472d2dbcd69c0925a8d009a25d7a44dec069743d17a54f79b9590c045273d5a9446313331603723e5cbb3c44c3a22c98514a951b7c540564da0"

RPROVIDES:${PN} += "cmake(KPim5AddressbookImportExport) cmake(KPimAddressbookImportExport) libKPim5AddressbookImportExport5-devel libKPim5AddressbookImportExport5-devel(aarch-64)"
RDEPENDS:${PN} += "libKPim5AddressbookImportExport5"

inherit rpm
