SUMMARY = "Simple, lightweight template for scientific documents"
DESCRIPTION = "This package provides a complete working directory for the \
scientific documentation of arbitrary projects. It was \
originally developed to provide a template for Austrian \
'Diplomarbeiten' or 'Vorwissenschaftliche Arbeiten', which are \
scientfic projects of students at a secondary school."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn36354"

RPM_NAME = "texlive-etdipa-2023.201.2.6svn36354-52.1.noarch.rpm"
RPM_HASH = "2a9c7cebf194fbf5afe0d94ab0fb8908f0306b3cfd7bc94157748eceeb1475a916f631f6f20b57727199a16a06dacef0425cf692762c5ac1d65bd91f72113da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etdipa"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
