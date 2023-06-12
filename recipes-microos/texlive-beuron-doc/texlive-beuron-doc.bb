SUMMARY = "Documentation for texlive-beuron"
DESCRIPTION = "This package includes the documentation for texlive-beuron"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn46374"

RPM_NAME = "texlive-beuron-doc-2023.201.1.3svn46374-53.1.noarch.rpm"
RPM_HASH = "0d442475f236019123db6f09ca6f75612a2f52887ab6bffbaba85ff94a6fed9c84b49e0f5ff3d6adba3e839287cf046dd4bb6d60e520172b60f210f1a50559ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-beuron-doc:de;en) \
texlive-beuron-doc"
RDEPENDS:${PN} += ""

inherit rpm
