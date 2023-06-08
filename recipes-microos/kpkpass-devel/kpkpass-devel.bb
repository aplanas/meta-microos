SUMMARY = "Development files for kpkpass"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kpkpass library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kpkpass-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "493ae3b3cf9a7ee5e56926033365e146dc1e2ee6601667a565b27ff639a1bb2702d5b92a8519d2a48a7345ce4ea2dfa8e6aef284e8097f9d365accad9ea18b44"

RPROVIDES:${PN} += "cmake(KPim5PkPass) cmake(KPimPkPass) kpkpass-devel kpkpass-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Archive) libKPim5PkPass5"

inherit rpm
