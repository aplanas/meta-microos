SUMMARY = "Documentation for texlive-nanumtype1"
DESCRIPTION = "This package includes the documentation for texlive-nanumtype1"
LICENSE = "OFL-1.1"

PV = "2023.201.3.0svn29558"

RPM_NAME = "texlive-nanumtype1-doc-2023.201.3.0svn29558-54.1.noarch.rpm"
RPM_HASH = "1dfd056c3cd8fd9da198abb21188a62de959d07c3d40c15330f42455fc71cc77834b45305e3106cfbb76c9a6a88c6eb8140deaaa35e522dc65ae39ac760c9974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nanumtype1-doc"
RDEPENDS:${PN} += ""

inherit rpm
