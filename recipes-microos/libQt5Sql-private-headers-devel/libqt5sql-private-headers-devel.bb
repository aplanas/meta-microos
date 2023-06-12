SUMMARY = "Non-ABI stable experimental API for the Qt5 SQL library"
DESCRIPTION = "This package provides private headers of libQt5Sql that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "d5e60a7e2d81515d5a45454bac891e565323f03b0c12224fd528f4397296ffb9b630f3d39815efb068c9909f46046a9870b0f2977c021003ed7a1cf4f31fb760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Sql-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Sql-devel"

inherit rpm
