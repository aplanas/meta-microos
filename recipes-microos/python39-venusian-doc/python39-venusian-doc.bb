SUMMARY = "Documentation for python39-venusian"
DESCRIPTION = "This package contains documentation files for python39-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python39-venusian-doc-3.0.0-2.14.noarch.rpm"
RPM_HASH = "1636f42e2a6b388e4140d7a0783bd4ed0fbacbd99d3a571e2ca2c5b782d921ea2092d3915c55b9854d1e16e7f5f511756ef1b8b2c83ff2f80e897830ece6cd49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-venusian-doc"
RDEPENDS:${PN} += "python39-venusian"

inherit rpm
