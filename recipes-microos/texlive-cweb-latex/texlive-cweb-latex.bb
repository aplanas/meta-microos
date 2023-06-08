SUMMARY = "A LaTeX version of CWEB"
DESCRIPTION = "This bundle allows marking-up of CWEB code in LaTeX. The \
distribution includes the 'Counting Words' program distributed \
with CWEB, edited to run with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn28878"

RPM_NAME = "texlive-cweb-latex-2023.204.svn28878-54.1.noarch.rpm"
RPM_HASH = "f6a98e8fa450e9b227f133adca445d14aa68b8a79950fcad92f642bac072fcca2ebb51053e0db3a44d21553433a127918d1a5e87112f93117b700abbe37f4689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cwbl-german.sty) tex(cweb.cls) tex(cwebarray.sty) tex(cwebbase.tex) tex(keyvald.sty) texlive-cweb-latex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
