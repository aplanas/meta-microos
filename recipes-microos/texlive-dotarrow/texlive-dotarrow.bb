SUMMARY = "Extendable dotted arrows"
DESCRIPTION = "The package can draw dotted arrows that are extendable, in the \
same was as \\xrightarrow."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01asvn15878"

RPM_NAME = "texlive-dotarrow-2023.201.0.0.01asvn15878-52.1.noarch.rpm"
RPM_HASH = "f4e550a3f0433577997f301df9fb9a57478805607767037d1b5d7bd1e761033b05be3ea31ade10eb914d1b65e2757db3ec84259182296781b0cfc4a99196e8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(DotArrow.sty) \
texlive-dotarrow"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
