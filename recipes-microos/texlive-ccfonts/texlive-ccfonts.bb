SUMMARY = "Support for Concrete text and math fonts in LaTeX"
DESCRIPTION = "LaTeX font definition files for the Concrete fonts and a LaTeX \
package for typesetting documents using Concrete as the default \
font family. The files support OT1, T1, TS1, and Concrete \
mathematics including AMS fonts (Ulrik Vieth's concmath)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61431"

RPM_NAME = "texlive-ccfonts-2023.201.svn61431-52.1.noarch.rpm"
RPM_HASH = "cba24577eb125c220563b0f90872bdd920e8034f60dc2fca3a94f4fc1fbdf9e371015f6d9434db7dacb4e048c0bcfaad5b51f239c3cdebb618ea4c794bd0f961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ccfonts.sty) tex(t1ccr.fd) tex(ts1ccr.fd) texlive-ccfonts"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
