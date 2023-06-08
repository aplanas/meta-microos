SUMMARY = "A Computer Modern Pica variant"
DESCRIPTION = "An approximate equivalent of the Xerox Pica typeface; the font \
is optimised for submitting fiction manuscripts to mainline \
publishers. The font is a fixed-width one, rather less heavy \
than Computer Modern typewriter. Emphasis for bold-face comes \
from a wavy underline of each letter. The two fonts are \
supplied as Metafont source."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-cmpica-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "05de0b3919818f85810682505cc86cd68b1484b512039138357a91948286c62ace7d06ff35ef110c817e5be281136471de1e72e6adbe17a7f924ea093bb87c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmpica.tfm) tex(cmpicab.tfm) tex(cmpicati.tfm) texlive-cmpica"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
