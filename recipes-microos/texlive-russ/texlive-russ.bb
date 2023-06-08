SUMMARY = "LaTeX in Russian, without babel"
DESCRIPTION = "The package aims to facilitate Russian typesetting (based on \
input using MicroSoft Code Page 1251). Russian hyphenation is \
selected, and various mathematical commands are set up in \
Russian style. Furthermore all Cyrillic letters' catcodes are \
set to 'letter', so that commands with Cyrillic letters in \
their names may be defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25209"

RPM_NAME = "texlive-russ-2023.201.svn25209-53.1.noarch.rpm"
RPM_HASH = "46ab4b7597574de051bb2abecbfe77840fcea53a6fa12f21e3632be04c6d1d9e6225eeff4d1e5feb016aca051d923fe7f91d43e29073bda21d0f9cacb5a607cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(russ.sty) texlive-russ"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(inputenc.sty) tex(t2aenc.def) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
