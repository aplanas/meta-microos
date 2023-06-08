SUMMARY = "Documentation for python310-venusian"
DESCRIPTION = "This package contains documentation files for python310-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python310-venusian-doc-3.0.0-2.14.noarch.rpm"
RPM_HASH = "15380d5f85be92e06b25879c614036d52df85b2c70d0caf9eaf4672419426d017dde3a00a51563bb6785e020d8733fdf3a31600dfcf2113215812239d925690d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-venusian-doc python310-venusian-doc"
RDEPENDS:${PN} += "python310-venusian"

inherit rpm
