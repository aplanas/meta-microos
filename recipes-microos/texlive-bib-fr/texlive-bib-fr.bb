SUMMARY = "French translation of classical BibTeX styles"
DESCRIPTION = "These files are French translations of the classical BibTeX \
style files. The translations can easily be modified by simply \
redefining FUNCTIONs named fr.*, at the beginning (lines \
50-150) of each file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-bib-fr-2023.201.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "1031fd38cbdc75f16d70e4db81b500c97cfa83c0583b213c9f73ec9c3a323ce0ab2b5754f33cd43bb7c5af36edef3b81abc735a019318e9b3c03ddc4af7dc9e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bib-fr"
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
