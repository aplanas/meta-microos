SUMMARY = "Detect pTeX and its derivatives"
DESCRIPTION = "The package provides commands for detecting pTeX and its \
derivatives (e-pTeX, upTeX, e-upTeX, and ApTeX). Both LaTeX and \
plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2023.201.0.0.2svn46153"

RPM_NAME = "texlive-ifxptex-2023.201.0.0.2svn46153-52.1.noarch.rpm"
RPM_HASH = "b293125cf06624086d11d09ade1fe2301a4152e7163eda44825b556865d31686a7f62804474923cd3fc4e9a3280e851a1fa239fec95bc2a4b96d5b9785e8cda8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ifxptex.sty) \
texlive-ifxptex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
