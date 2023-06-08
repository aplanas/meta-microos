SUMMARY = "Identify (typographic) widows and orphans"
DESCRIPTION = "This package identifies all widows and orphans in a document to \
help a user to get rid of them. The act of resolving still \
needs to be done manually: By rewriting text, running some \
paragraph long or short or or explicitly breaking in some \
strategic place. It will also identify and warn about words \
broken across columns or pages and display formulas separated \
from their introductory paragraph."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0esvn66532"

RPM_NAME = "texlive-widows-and-orphans-2023.201.1.0esvn66532-53.1.noarch.rpm"
RPM_HASH = "9254e0a472608bf97f21501083cb4290a797cba3542d070cb3bffc5a9ee987694fe5808e5c7ecd1546c4077790433cb102da4e1671f8f228c040594cb8b5362a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(widows-and-orphans.sty) texlive-widows-and-orphans"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(l3keys2e.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
