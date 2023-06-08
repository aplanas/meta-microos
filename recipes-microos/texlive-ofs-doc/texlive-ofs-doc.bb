SUMMARY = "Documentation for texlive-ofs"
DESCRIPTION = "This package includes the documentation for texlive-ofs"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn16991"

RPM_NAME = "texlive-ofs-doc-2023.201.svn16991-54.1.noarch.rpm"
RPM_HASH = "da6f0ec4ce9480ab8cb97cec6300e8a52535f9965ef77815514663b07bb65efe6d150fe9a2e4c2f75ee951953f0cba51f4e1569878db1ed11817e9cd1df7f2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ofs-doc:en;cs) texlive-ofs-doc"
RDEPENDS:${PN} += ""

inherit rpm
