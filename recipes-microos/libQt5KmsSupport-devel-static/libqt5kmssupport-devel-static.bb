SUMMARY = "Qt KMS support module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5KmsSupport-devel-static-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "652595981cc10342961b18f9bf294cc3a1db683fa839774c1b75409e9fe9aebe35e328676a1fe5fd8fec615558af3df03ca1a109c2feb97b7305811902313e1a"

RPROVIDES:${PN} += "cmake(Qt5KmsSupport) libQt5KmsSupport-devel-static libQt5KmsSupport-devel-static(aarch-64)"
RDEPENDS:${PN} += "libQt5Core-devel libQt5Gui-devel"

inherit rpm
