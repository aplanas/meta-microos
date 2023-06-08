SUMMARY = "Create tabular cells spanning multiple rows"
DESCRIPTION = "The package has a lot of flexibility, including an option for \
specifying an entry at the 'natural' width of its text. The \
package is distributed with the bigdelim and bigstrut packages, \
which can be used to advantage with \\multirow cells."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.8svn58396"

RPM_NAME = "texlive-multirow-2023.201.2.8svn58396-54.1.noarch.rpm"
RPM_HASH = "a9a260461542a98f2c4c4c47326f5c8fc34cc08232b1be6bcfd1c378d2f2f8e8ff2287ac093ae4c9f9b50ca30427f668f7ab7b08dd44fe703b94b5df3a645342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bigdelim.sty) tex(bigstrut.sty) tex(multirow.sty) texlive-multirow"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
