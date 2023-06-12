SUMMARY = "Development files for xmlbird"
DESCRIPTION = "XML parser with support for Vala iterators. \
 \
This package contains the pkgconfig, header files and libraries needed to \
develop application that use xmlbird."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.12"

RPM_NAME = "xmlbird-devel-1.2.12-1.3.aarch64.rpm"
RPM_HASH = "4f7e09948b7490e359bb0de51969a4d4e2cf8e715496fabb4545b9a2de1475a7ce121cbd4166e4e4eeadbaa6c9c0d963bd7d4884ee710bbfc65e82e7ab975927"

RPROVIDES:${PN} += "pkgconfig(xmlbird) \
xmlbird-devel \
xmlbird-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlbird1 \
pkgconfig(glib-2.0)"

inherit rpm
