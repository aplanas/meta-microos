SUMMARY = "Development files for KSMTP"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the KSMTP library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ksmtp-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c63abab9a9d9cb3d0160b2eeee17a684e81a91d4bc383076f6ca46a8c85fcbe26823c369c4cce692771d462a830cddf7f1259709dbf81252a7dbd4e1c715090b"

RPROVIDES:${PN} += "cmake(KPim5SMTP) cmake(KPimSMTP) ksmtp-devel ksmtp-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cmake(KF5I18n) cmake(KF5KIO) cmake(KPim5Mime) libKPim5SMTP5"

inherit rpm
