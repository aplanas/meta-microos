SUMMARY = "Subversion variants of \\Provides... macros"
DESCRIPTION = "The package introduces Subversion variants of the standard \
LaTeX macros \\ProvidesPackage, \\ProvidesClass and \\ProvidesFile \
where the file name and date is extracted from Subversion Id \
keywords. The file name may also be given explicitly as an \
optional argument."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1862svn64967"

RPM_NAME = "texlive-svn-prov-2023.201.3.1862svn64967-57.1.noarch.rpm"
RPM_HASH = "ab70a1241cf71a2a5bae572e6bedd0431501400bb7b1a5cd6ccdfe2abb07616c350fc5d5449eb1ec8be89279bcefdf713cf618a8d3dbfbe445d4855304dc7049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(svn-prov.sty) texlive-svn-prov"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
