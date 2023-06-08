SUMMARY = "A 'convenience wrapper' for High Energy Physics packages"
DESCRIPTION = "Loads the author's hepunits and hepnicenames packages, and a \
selection of others that are useful in High Energy Physics \
papers, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hep-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "f795ec3f8feee1f4854336d9fe0f7350c7a1b956f86789ccf592b62710f636b781ab234bfc86c82985052542fd98b72ffcd7d9cce59baff7374d0c16e2f3b2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hep.sty) texlive-hep"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(afterpage.sty) tex(amsmath.sty) tex(booktabs.sty) tex(braket.sty) tex(cancel.sty) tex(caption.sty) tex(ccaption.sty) tex(cite.sty) tex(fancyhdr.sty) tex(feynmf.sty) tex(hepnicenames.sty) tex(hepunits.sty) tex(hyperref.sty) tex(morefloats.sty) tex(setspace.sty) tex(slashed.sty) tex(subfigure.sty) tex(tocbibind.sty) tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
