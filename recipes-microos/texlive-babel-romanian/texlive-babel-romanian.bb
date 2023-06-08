SUMMARY = "Babel support for Romanian"
DESCRIPTION = "The package provides the language definition file for support \
of Romanian in babel. Translations to Romanian of standard \
'LaTeX names' are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2msvn58776"

RPM_NAME = "texlive-babel-romanian-2023.201.1.2msvn58776-53.1.noarch.rpm"
RPM_HASH = "ecb3115434580358da031acc082a5ad1cc718ac1ec871205c102d1a18c753d2ae61eb3ef2dcf1e7c08de9310c52eb32b8e9addb58e3cfc379031ce1c22f3d965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(romanian.ldf) texlive-babel-romanian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
