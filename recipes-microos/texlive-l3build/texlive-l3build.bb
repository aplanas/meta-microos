SUMMARY = "A testing and building system for (La)TeX"
DESCRIPTION = "The build system supports testing and building LaTeX3 code, on \
Linux, Mac OS X and Windows systems. The package offers: A unit \
testing system for (La)TeX code (whether kernel code or \
contributed packages); A system for typesetting package \
documentation; and An automated process for creating CTAN \
releases. The package is essentially independent of other \
material released by the LaTeX3 team, and may be updated on a \
different schedule."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66471"

RPM_NAME = "texlive-l3build-2023.201.svn66471-55.1.noarch.rpm"
RPM_HASH = "cce7d5e6ca55294896e580f946d85b3c220a281f92ffb5f624c314e5394b0a003cce379c4e46c04cabc4b79793ae3cd1e917eebf60ffaf771f0ed15e3a88f2eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(regression-test.tex) texlive-l3build"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-l3build-bin texlive-luatex texlive-scripts texlive-scripts-bin"

inherit rpm
