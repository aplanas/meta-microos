SUMMARY = "Czech/Slovak"
DESCRIPTION = "Support for Czech/Slovak."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-collection-langczechslovak-2023.201.svn54074-56.1.noarch.rpm"
RPM_HASH = "79eb8fbaf15c6bc039982f9ac1d6cad7befc00c63fe1524834ec72bf168fb29b311c874984f430ba978d2cc932412548b7c8292d1be831f69a6f0b8394dc7931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langczechslovak"
RDEPENDS:${PN} += "texlive-babel-czech texlive-babel-slovak texlive-cnbwp texlive-collection-basic texlive-collection-latex texlive-cs texlive-csbulletin texlive-cslatex texlive-csplain texlive-cstex texlive-hyphen-czech texlive-hyphen-slovak texlive-lshort-czech texlive-lshort-slovak texlive-texlive-cz texlive-vlna"

inherit rpm
