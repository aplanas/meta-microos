SUMMARY = "Non-ABI stable experimental API for the Qt5 SQL library"
DESCRIPTION = "This package provides private headers of libQt5Sql that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Sql-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "addf760cb23f3508e026e8f2c9c59ca20dee1114b3e011d613dddebcdc6ae990265c0886f88164ed11c8d7e6943632a7708963430cdf041aceb4a55bfa50f104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Sql-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Sql-devel"

inherit rpm
