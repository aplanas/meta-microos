SUMMARY = "Run external programs on the contents of a start-stop environment"
DESCRIPTION = "The filter module provides a simple interface to run external \
programs on the contents of a start-stop environment. Options \
are available to run the external program only if the content \
of the environment has changed, to specify how the program \
output should be read back, and to choose the name of the \
temporary files that are created. The module is compatible with \
both MkII and MkIV."
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn62070"

RPM_NAME = "texlive-context-filter-2023.204.svn62070-54.1.noarch.rpm"
RPM_HASH = "ab0ba6a27a828630d1f000558ab2376f608f0d2b600dd98d512232c7a6da276e51bb003936cd29b433bd5e1ca6db4ff9d24b56158b1d712b166c2ba79f84c0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-filter"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-context texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
