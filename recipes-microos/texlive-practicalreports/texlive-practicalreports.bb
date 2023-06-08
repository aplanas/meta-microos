SUMMARY = "Some macros for writing practical reports"
DESCRIPTION = "This package provides a handful of macros for writing up \
science practical reports."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.3svn52312"

RPM_NAME = "texlive-practicalreports-2023.201.2.0.3svn52312-52.1.noarch.rpm"
RPM_HASH = "51e5a8cf137126ff0864d0d36beec1f923c7c0cb128f0240bb26e0027504a5f5e4fda0ea093d9f88963badbbe5583458253fb8431ee6e115b2eb5e533ff7875d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(practicalreports.sty) texlive-practicalreports"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(fancyhdr.sty) tex(float.sty) tex(lastpage.sty) tex(longtable.sty) tex(mathtools.sty) tex(pdfpages.sty) tex(pgffor.sty) tex(scrextend.sty) tex(tikzducks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
