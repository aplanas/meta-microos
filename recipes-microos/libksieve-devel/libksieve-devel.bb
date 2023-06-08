SUMMARY = "Development package for libksieve"
DESCRIPTION = "This package contains development headers of libksieve."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libksieve-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e188e4e1b14351dd949087361b93433cbfa2b5c9e27c7948b897754c1f9fd62221f0e703d517f4303bc79ec8bf41b4ad9906c36bddd1295f1175ef764f44401c"

RPROVIDES:${PN} += "cmake(KF5LibKSieve) cmake(KPim5LibKSieve) libksieve-devel libksieve-devel(aarch-64)"
RDEPENDS:${PN} += "libksieve5"

inherit rpm
