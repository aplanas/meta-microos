SUMMARY = "Documentation for texlive-dosepsbin"
DESCRIPTION = "This package includes the documentation for texlive-dosepsbin"
LICENSE = "Artistic-1.0"

PV = "2023.201.1.2svn29752"

RPM_NAME = "texlive-dosepsbin-doc-2023.201.1.2svn29752-52.1.noarch.rpm"
RPM_HASH = "895bb70f20f0f7509d2563985dbeddaf58fd7467ca07ee833bd4445b79275889a93c6f79b8f3e9e8d677e4ea3a0ad7613da1e69ffe667b91014ee115b6fddb03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dosepsbin.1) texlive-dosepsbin-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
