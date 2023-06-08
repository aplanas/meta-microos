SUMMARY = "Statistics style"
DESCRIPTION = "A package defining many macros for items of significance in \
statistical presentations. An updated, but incompatible, \
version of the package is available: statex2."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn20306"

RPM_NAME = "texlive-statex-2023.201.1.6svn20306-57.1.noarch.rpm"
RPM_HASH = "e385bf905bcd1f7de94b70039389014088cf58bdd05a13974c8ccea4f538edad16ba7436023cd93b575ab3f0ce5ced44ea25f89eb2c56b574fd79c3cb8dfe846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(statex.sty) texlive-statex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amssymb.sty) tex(bm.sty) tex(color.sty) tex(ifthen.sty) tex(shortvrb.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
