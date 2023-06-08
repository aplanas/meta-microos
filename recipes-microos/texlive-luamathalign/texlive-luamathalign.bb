SUMMARY = "More flexible alignment in amsmath environments"
DESCRIPTION = "Allow aligning mathematical expressions on points where where \
direcly using & is not possible, especially in nested macros or \
environments."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn63226"

RPM_NAME = "texlive-luamathalign-2023.201.0.0.3svn63226-52.1.noarch.rpm"
RPM_HASH = "604187ecb27d1de38c75cbfe5f9b083095336be4de3bb34334962adf353ae370e6f7987734178a11d8b2dc06a8db5b71c4463ba7ceab46daf59f87a88ab0f98c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luamathalign.sty) texlive-luamathalign"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(iftex.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
