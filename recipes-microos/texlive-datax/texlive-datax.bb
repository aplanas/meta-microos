SUMMARY = "Import individual data from script files"
DESCRIPTION = "This LaTeX package uses pgfkeys to retrieve individual data \
points generated in some script. Analogous to how one might \
generate graphics in a script and import those graphics into a \
LaTeX document."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.2.0svn61772"

RPM_NAME = "texlive-datax-2023.204.1.2.0svn61772-54.1.noarch.rpm"
RPM_HASH = "f37e7520919d4ea5319a1582814f77458d0cd6fb3a00d24768698173f112a1ec36fcbb3b64297d1bab5032847268f2efcbfada6c1d887084d7d890fa0ba277f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datax.sty) texlive-datax"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pgfkeys.sty) tex(pgfopts.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
