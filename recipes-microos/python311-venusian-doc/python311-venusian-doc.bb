SUMMARY = "Documentation for python311-venusian"
DESCRIPTION = "This package contains documentation files for python311-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python311-venusian-doc-3.0.0-2.14.noarch.rpm"
RPM_HASH = "9afaa2314336d0b45ce315cc99efbb3dd7da311287628f942330b45c109fd0da375d51171edd096d56996620381c2cb61d1058dc49eed04832263e8d2c0082cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-venusian-doc"
RDEPENDS:${PN} += "python311-venusian"

inherit rpm
