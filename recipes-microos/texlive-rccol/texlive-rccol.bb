SUMMARY = "Decimal-centered optionally rounded numbers in tabular"
DESCRIPTION = "The rccol package provides decimal-centered numbers: \
corresponding digits and decimal separators aligned. \
Furthermore, rounding to the desired precision is possible. The \
package makes use of the fltpoint package (as well as the LaTeX \
required array package)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2csvn15878"

RPM_NAME = "texlive-rccol-2023.201.1.2csvn15878-53.1.noarch.rpm"
RPM_HASH = "512c91e6959415efbc823e324c34cd4c613bfbe29753cb4a841a65e558613a7d38135e54d4039394a97d279625d55a69cee5a56d6ebf494bd417fb518859554a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rccol.sty) texlive-rccol"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(fltpoint.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
