SUMMARY = "Development package for libkdepim"
DESCRIPTION = "The development package for the libkdepim libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkdepim-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8d50fce436bce6709db0220ab7261d4c49793370bbdde702e22862418754a46d9a999732b9a2757d34f2a24378749db8f27b802ae304061bdcc45ab3e793a8e0"

RPROVIDES:${PN} += "cmake(KF5Libkdepim) cmake(KPim5Libkdepim) cmake(KPim5MailTransportDBusService) cmake(MailTransportDBusService) libkdepim-devel libkdepim-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KPim5Akonadi) cmake(KPim5AkonadiContact) libKPim5Libkdepim5 libkdepim"

inherit rpm
