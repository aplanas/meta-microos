SUMMARY = "HTML rendering engine"
DESCRIPTION = "KHTML is a web rendering engine, based on the KParts \
technology and using KJS for JavaScript support. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "khtml-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "c9dccd57382ccd1e9ccf84242060ed9d7186cc77b61799f9bbb9958d8116876be798bea3b5501ed336bb940f6d24d01bc312ce12b54fda4cb26d43e96dde6014"

RPROVIDES:${PN} += "cmake(KF5KHtml) khtml-devel khtml-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Codecs) cmake(KF5I18n) cmake(KF5JS) cmake(KF5KIO) cmake(KF5Parts) cmake(KF5TextWidgets) cmake(Qt5Gui) extra-cmake-modules libKF5KHtml5"

inherit rpm
