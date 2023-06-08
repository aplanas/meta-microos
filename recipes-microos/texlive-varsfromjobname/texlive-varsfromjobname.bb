SUMMARY = "Extract variables from the name of the LaTeX file"
DESCRIPTION = "The package allows the user to extract information from the job \
name, provided that the name has been structured appropriately: \
the package expects the file name to consist of a set of words \
separated by hyphens."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44154"

RPM_NAME = "texlive-varsfromjobname-2023.201.1.0svn44154-53.1.noarch.rpm"
RPM_HASH = "e0641039fe22bedb59c00f6e301b4fed3e3b584849b8bbd95b6c5a72dcfdb2c2d2b49d2f96417d0080cedf78ed2d079814187a88077bb01a9dd2e0b732e9baca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(varsfromjobname.sty) texlive-varsfromjobname"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(currfile.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
