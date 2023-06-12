SUMMARY = "Development package for mailimporter"
DESCRIPTION = "This package provides the development headers of the mailimporter library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "mailimporter-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d546407b4bc401f4a2d42db1e24a0cb18757ebac02f967613b508284e369dafe94fd15a1e754ba0fa8e77931977cf5bf7fdaad710fabdbbc7b801a3875efc30f"

RPROVIDES:${PN} += "cmake(KF5MailImporter) cmake(KF5MailImporterAkonadi) cmake(KPim5MailImporter) cmake(KPim5MailImporterAkonadi) mailimporter-devel mailimporter-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Archive) libKPim5MailImporter5 libKPim5MailImporterAkonadi5"

inherit rpm
