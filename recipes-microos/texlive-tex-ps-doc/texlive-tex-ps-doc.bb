SUMMARY = "Documentation for texlive-tex-ps"
DESCRIPTION = "This package includes the documentation for texlive-tex-ps"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-tex-ps-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "ed211590972911c583dd9cb7c8d419e2a671a61032b6b62066fe86e552dc41987d63f9eff20080f793c0e16599d3d7ae3ad6ae3feb99dd3cdf3b963bca5f39d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ps-doc"
RDEPENDS:${PN} += ""

inherit rpm
