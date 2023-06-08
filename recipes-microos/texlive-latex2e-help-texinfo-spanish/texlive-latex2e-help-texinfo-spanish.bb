SUMMARY = "Unofficial reference manual covering LaTeX2e"
DESCRIPTION = "The manual is provided as Texinfo source (which was originally \
derived from the VMS help file in the DECUS TeX distribution of \
1990, with many subsequent changes). This is a collaborative \
development, and details of getting involved are to be found on \
the package home page. A French translation is available as a \
separate package. All the other formats in the distribution are \
derived from the Texinfo source, as usual."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65614"

RPM_NAME = "texlive-latex2e-help-texinfo-spanish-2023.201.svn65614-54.1.noarch.rpm"
RPM_HASH = "052013374846682922bf143b5c68043add52c1d28efb298b139cfedf2894e66baefcb4523985ee64368de43291f9b9be46df6a553b783a5fa236540ff561233b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo-spanish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
