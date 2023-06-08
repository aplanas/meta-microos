SUMMARY = "St Mary Road symbols for theoretical computer science"
DESCRIPTION = "The fonts were originally distributed as Metafont sources only, \
but Adobe Type 1 versions are also now available. Macro support \
is provided for use under LaTeX; the package supports the \
'only' option (provided by the somedefs package) to restrict \
what is loaded, for those who don't need the whole font."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22027"

RPM_NAME = "texlive-stmaryrd-2023.201.svn22027-57.1.noarch.rpm"
RPM_HASH = "e644688cbb7abad92eaa016fcdb7316dd24510c520bed8cff5f6be254f9c8dd21424b4671a11ebf01e984b4c9045f00e637236bee29a4acd576c71dd066b0c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Ustmry.fd) tex(stmary10.tfm) tex(stmary5.tfm) tex(stmary6.tfm) tex(stmary7.tfm) tex(stmary8.tfm) tex(stmary9.tfm) tex(stmaryrd.map) tex(stmaryrd.sty) texlive-stmaryrd"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-stmaryrd-fonts"

inherit rpm
