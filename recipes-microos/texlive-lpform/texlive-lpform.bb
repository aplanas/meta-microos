SUMMARY = "Typesetting linear programming formulations and sets of equations"
DESCRIPTION = "The package is designed to aid the author writing linear \
programming formulations, one restriction at a time. With the \
package, one can easily label equations, formulations can span \
multiple pages and several elements of the layout (such as \
spacing, texts and equation tags) are also customizable. \
Besides linear programming formulations, this package can also \
be used to display any series of aligned equations with easy \
labeling/referencing and other customization options."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn36918"

RPM_NAME = "texlive-lpform-2023.201.svn36918-54.1.noarch.rpm"
RPM_HASH = "66ffef518f0225ed076e11b08abfa15486748ad45ccbac2b75d707b65484c027157a3671ccb2806cd4bdbb2ed6adfda8241af1412c9290974ca6800070dec0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lpform.sty) texlive-lpform"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
