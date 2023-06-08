SUMMARY = "A short guide to using LaTeX2e to typeset high quality documents"
DESCRIPTION = "This document is a short guide to using LaTeX2e to typeset high \
quality documents. It focuses on users of Windows and guides \
the reader through installation, some of LaTeX's conventions, \
and creating the front matter, body and end matter. The \
appendices contain a list of useful facilities not otherwise \
covered in this document and a list of helpful resources."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.1.1svn65714"

RPM_NAME = "texlive-yet-another-guide-latex2e-2023.201.1.1svn65714-52.1.noarch.rpm"
RPM_HASH = "b3f4cda31d6dea7e839f05d77fcb8ac4b3d01defc82f42abfdbda82f702e5cd68ace7b463e61aa7627ee0e31a3e4dd0b5ae838fef9cd53f94dacff688fe64c46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yet-another-guide-latex2e"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
