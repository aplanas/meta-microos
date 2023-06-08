SUMMARY = "Libyui - Header files for the Qt (graphical) user interface"
DESCRIPTION = "This package contains the header files for the Qt based \
user interface component for libyui. \
 \
This package is not needed to develop libyui-based applications, \
only to develop extensions for libyui-qt."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-qt-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "a8b7149e61b23ff274cae0c0d9385925213662ffc21cbe2b688bfb0c79485deae4982e0c8d283abc53d05f447a77de8aee8710e1bfbf9a056257056a7f0cd4ee"

RPROVIDES:${PN} += "libyui-qt-devel libyui-qt-devel(aarch-64) pkgconfig(libyui-qt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config fontconfig-devel libyui-devel libyui-qt16"

inherit rpm
