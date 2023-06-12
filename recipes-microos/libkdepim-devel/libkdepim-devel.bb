SUMMARY = "Development package for libkdepim"
DESCRIPTION = "The development package for the libkdepim libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkdepim-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4e4545ad776e6dc33ca552e6e0da8f3dfa73f2b0524528e6bbf9757319701a3db87de0e2886cefd788faebae43fab7df5571af2ef828b9e50f2e2af23e896a40"

RPROVIDES:${PN} += "cmake(KF5Libkdepim) cmake(KPim5Libkdepim) cmake(KPim5MailTransportDBusService) cmake(MailTransportDBusService) libkdepim-devel libkdepim-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KPim5Akonadi) cmake(KPim5AkonadiContact) libKPim5Libkdepim5 libkdepim"

inherit rpm
