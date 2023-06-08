SUMMARY = "Documentation for texlive-csbulletin"
DESCRIPTION = "This package includes the documentation for texlive-csbulletin"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn65250"

RPM_NAME = "texlive-csbulletin-doc-2023.204.svn65250-54.1.noarch.rpm"
RPM_HASH = "c40257fd2936f58ebdb791e782feec1183ced6f8ce25fb0c10183d9f296dc6c879ea825b177dac484401e7430e71acaf0f4bbb374f7d6b53d28385262d6b7180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-csbulletin-doc:cs) texlive-csbulletin-doc"
RDEPENDS:${PN} += ""

inherit rpm
