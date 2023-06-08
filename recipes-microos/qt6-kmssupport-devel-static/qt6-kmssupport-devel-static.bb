SUMMARY = "Qt KMSSupport module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-kmssupport-devel-static-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "3a9292951c34fdd3a2d0be84cb592528ac5c155706bd3cf50d2881329e338ce04c59671184f3a598710fceca95107139eb6bf93156bd24edda812f620d0b23f5"

RPROVIDES:${PN} += "cmake(Qt6KmsSupportPrivate) qt6-kmssupport-devel-static qt6-kmssupport-devel-static(aarch-64)"
RDEPENDS:${PN} += "qt6-core-private-devel qt6-gui-private-devel"

inherit rpm
