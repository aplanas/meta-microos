SUMMARY = "A minimal method for making generic packages"
DESCRIPTION = "The package provides a minimal method for making generic (i.e., \
TeX-format-independent) packaged, combining maybeload \
functionality, fallback definitions for LaTeX \\ProvidesPackage \
and \\RequirePackage functionality, and handling of arbitrary \
(multiple) 'private letters' (analagous LaTeX packages' use of \
'@') in nested package files. The documentation contains a \
central reference for making and using generic packages based \
on the package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn27765"

RPM_NAME = "texlive-plainpkg-2023.201.0.0.4asvn27765-51.1.noarch.rpm"
RPM_HASH = "3f13891f3ec4c92b7195015060b053fbbd84368ce2163adbee57199a462faf4e2b2a4d9aedd44bddd5b9ffe635d5c5d49cccaf5d43bc13f00150385f948c112a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(plainpkg.tex) \
texlive-plainpkg"
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
