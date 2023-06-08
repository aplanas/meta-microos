SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kjobwidgets-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "a8c83bd96ea32b531628f2e01d22a5ff3c565bcf4b9de1d75e59d39bcceb2460b91ab7c688a19dac23d0e4eae987181c4de44c32c4fb7ce440b8f60dc5d45941"

RPROVIDES:${PN} += "cmake(KF5JobWidgets) kjobwidgets-devel kjobwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cmake(Qt5Widgets) extra-cmake-modules libKF5JobWidgets5"

inherit rpm
