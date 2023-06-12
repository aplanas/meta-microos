SUMMARY = "Development files for kpkpass"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kpkpass library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kpkpass-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "434f91444b7c564d3d377938c6111f67b51b0f882814a111f905db93ed757eb8de0790593e3dd0aff0306f8f1b9d8145d082dc294adc6bec9e791e28161567fa"

RPROVIDES:${PN} += "cmake(KPim5PkPass) cmake(KPimPkPass) kpkpass-devel kpkpass-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Archive) libKPim5PkPass5"

inherit rpm
