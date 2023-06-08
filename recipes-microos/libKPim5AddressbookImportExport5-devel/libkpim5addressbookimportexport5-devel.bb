SUMMARY = "Development headers for libKPimAddressbookImportExport"
DESCRIPTION = "This package includes development headers needed to develop and build import/export plugins \
for KAddressbook."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5AddressbookImportExport5-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "f5a71b72fa2b311a03a0953ce7e2420cdf2e281d59eb0788c20a67dec444bfc0548594266da2b5829e50b2cbc4dfe3cc4340ad01e13e5cd5e5dc521bd2e27473"

RPROVIDES:${PN} += "cmake(KPim5AddressbookImportExport) cmake(KPimAddressbookImportExport) libKPim5AddressbookImportExport5-devel libKPim5AddressbookImportExport5-devel(aarch-64)"
RDEPENDS:${PN} += "libKPim5AddressbookImportExport5"

inherit rpm
