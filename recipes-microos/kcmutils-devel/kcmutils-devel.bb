SUMMARY = "Build environment for kcmutils, a set of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcmutils-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "773800f26f253fa469dd750185b2782cbd8591acae045dbd5ce74a581804a4a110eadb86aee319cb50e579503adad0907d6f3d0ba9c421a8dd3ab3c43c9d84f4"

RPROVIDES:${PN} += "cmake(KF5KCMUtils) kcmutils-devel kcmutils-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5ConfigWidgets) cmake(KF5Service) extra-cmake-modules libKF5KCMUtils5 libKF5KCMUtilsCore5"

inherit rpm
