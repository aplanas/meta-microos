SUMMARY = "Non-ABI stable experimental API for the Qt5 PDF library"
DESCRIPTION = "This package provides private headers of libqt5-qtpdf that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.13"

RPM_NAME = "libqt5-qtpdf-private-headers-devel-5.15.13-3.2.noarch.rpm"
RPM_HASH = "2113e1e8e7abc42a96df1ea014e5781ab97f05f72117a41fcc36c82a4933ec7dfbb3dfd28e34145854ca34a1c1830512745641b0efc01d709c289904920e1390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtpdf-private-headers-devel"
RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel libqt5-qtpdf-devel"

inherit rpm
