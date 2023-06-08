SUMMARY = "A font offering the new (Indian) Rupee symbol"
DESCRIPTION = "The package provides LaTeX support for the (Indian) Rupee \
symbol font, created by TechFat. The original font has been \
converted to Adobe Type 1 format, and simple LaTeX support \
written for its use."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02svn20770"

RPM_NAME = "texlive-tfrupee-2023.201.1.02svn20770-54.1.noarch.rpm"
RPM_HASH = "569ee025480d860a38369122c4241ff0e4bcf47a603186ea4eaf76b9733a37b1f4430a7d5c4bc8e9b9bc4444f56462e4108a55047290675e37083907804970c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tfrupee.map) tex(tfrupee.sty) tex(tfrupee.tfm) texlive-tfrupee"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-tfrupee-fonts"

inherit rpm
