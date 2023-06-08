SUMMARY = "Documentation for texlive-feyn"
DESCRIPTION = "This package includes the documentation for texlive-feyn"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.4.3svn63945"

RPM_NAME = "texlive-feyn-doc-2023.201.0.0.4.3svn63945-52.1.noarch.rpm"
RPM_HASH = "60c076728198cceacc47d0468e9f0021d77c873e1769529fdac89bf8de1823aaed0d3d4940e2e43b2afd7bf032fddb2945085b8bfe0d65a7e0147881a2a2ca9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feyn-doc"
RDEPENDS:${PN} += ""

inherit rpm
