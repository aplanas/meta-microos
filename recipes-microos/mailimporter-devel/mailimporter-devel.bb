SUMMARY = "Development package for mailimporter"
DESCRIPTION = "This package provides the development headers of the mailimporter library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "mailimporter-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0ab43c4956fb342a3905006c5ac7f30958a58cbc04709fc8c8a81a02dbd8561cc62ab783d2bd57c42f13df18a75f6e160e0169364a437bbcf359e34800d978ac"

RPROVIDES:${PN} += "cmake(KF5MailImporter) cmake(KF5MailImporterAkonadi) cmake(KPim5MailImporter) cmake(KPim5MailImporterAkonadi) mailimporter-devel mailimporter-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Archive) libKPim5MailImporter5 libKPim5MailImporterAkonadi5"

inherit rpm
