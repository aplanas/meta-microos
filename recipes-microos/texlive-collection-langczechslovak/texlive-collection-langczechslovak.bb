SUMMARY = "Czech/Slovak"
DESCRIPTION = "Support for Czech/Slovak."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langczechslovak-2023.208.svn54074-58.1.noarch.rpm"
RPM_HASH = "31e1d5746727eefdf566638d20b0fc2c78b91927602a0b26cc513a7e07a5a7b5ac4d12685488acbacee7ed802d317f3eea9d1d49f8f6fb3a7950807442087338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langczechslovak"
RDEPENDS:${PN} += "texlive-babel-czech \
texlive-babel-slovak \
texlive-cnbwp \
texlive-collection-basic \
texlive-collection-latex \
texlive-cs \
texlive-csbulletin \
texlive-cslatex \
texlive-csplain \
texlive-cstex \
texlive-hyphen-czech \
texlive-hyphen-slovak \
texlive-lshort-czech \
texlive-lshort-slovak \
texlive-texlive-cz \
texlive-vlna"

inherit rpm
