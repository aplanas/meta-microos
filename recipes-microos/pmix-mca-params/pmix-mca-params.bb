SUMMARY = "Settings for the Module Component Architecure"
DESCRIPTION = "PMIX is part of the Module Component Architecure and needs so to have its \
parameters configured."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-mca-params-3.2.3-10.1.noarch.rpm"
RPM_HASH = "97c48ea9a0d780c8377ec70447025d7376809b6515a595d27147eb7399c6471c6ef8acf609cedb8d5976bc74057998853de43fa0db83b1680ee2fe861254c00f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(pmix-mca-params) \
pmix-mca-params \
pmix-runtime-config"
RDEPENDS:${PN} += ""

inherit rpm
