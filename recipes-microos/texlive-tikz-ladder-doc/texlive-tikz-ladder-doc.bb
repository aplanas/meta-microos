SUMMARY = "Documentation for texlive-tikz-ladder"
DESCRIPTION = "This package includes the documentation for texlive-tikz-ladder"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62992"

RPM_NAME = "texlive-tikz-ladder-doc-2023.201.1.3svn62992-52.1.noarch.rpm"
RPM_HASH = "c9fdc04b3a47562bc0d5b18473a15c9773d832d7d7fd474913eaf40541a13267919e2cea3329beff440316d463b624123884ec333d3e539ccbc7c1b37094b045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-ladder-doc"
RDEPENDS:${PN} += ""

inherit rpm
