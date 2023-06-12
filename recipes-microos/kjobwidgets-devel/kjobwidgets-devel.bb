SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kjobwidgets-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "19c34915a61d05c393d6642c9434148fdb600e8e0b11eb09b67f9ba64996ce8c1581f1adcd4438a4e92e7fc1befaa10970e488aea7620a51b87a4ab9578a2b2e"

RPROVIDES:${PN} += "cmake(KF5JobWidgets) kjobwidgets-devel kjobwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cmake(Qt5Widgets) extra-cmake-modules libKF5JobWidgets5"

inherit rpm
