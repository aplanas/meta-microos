SUMMARY = "Documentation for python39-venusian"
DESCRIPTION = "This package contains documentation files for python39-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python39-venusian-doc-3.0.0-3.1.noarch.rpm"
RPM_HASH = "a9834745b06357c3b4850182a3678a428b29a8ad6f5ec407470f281788e2a91c628be87447e88dcd102992a4f83086228a96ea618d662c65bb14dbcb100ae66b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-venusian-doc"
RDEPENDS:${PN} += "python39-venusian"

inherit rpm
