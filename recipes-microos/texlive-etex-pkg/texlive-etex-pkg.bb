SUMMARY = "E-TeX support package"
DESCRIPTION = "The package provides support for LaTeX documents to use many of \
the extensions offered by e-TeX; in particular, it modifies \
LaTeX's register allocation macros to make use of the extended \
register range. The etextools package provides macros that make \
more sophisticated use of e-TeX's facilities."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn41784"

RPM_NAME = "texlive-etex-pkg-2023.201.2.7svn41784-52.1.noarch.rpm"
RPM_HASH = "776accf4e30897ed1a89dcbc1784229402895bcbe2fd0ed5554f1d6491435190e2872d8316335f30b70b4b6f2111a2e44db763cda62898d1db1e16d8f7a2ed3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(etex.sty) \
texlive-etex-pkg"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
