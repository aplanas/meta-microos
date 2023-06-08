SUMMARY = "Framework to integrate services and actions - Build Environment"
DESCRIPTION = "This package contains development files needed to build applications which rely on the purpose framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "purpose-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "e5c474ccc7580fd13d4ca89d4351dd5eb93cce22189f5efa7c8250583bd21f2875ad2ec97a95cb093b141c4bbbef736709b4d6cb8bc35113f9f5dc8e5ee41e48"

RPROVIDES:${PN} += "cmake(KDEExperimentalPurpose) cmake(KF5Purpose) purpose-devel purpose-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) extra-cmake-modules libKF5Purpose5 libKF5PurposeWidgets5 purpose"

inherit rpm
