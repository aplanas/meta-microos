SUMMARY = "Get git metadata for a specific file"
DESCRIPTION = "If you are using git to control versions of LaTeX-files, you \
may want to show yourself or other users or devs the current \
version of the file, information about the author and last \
edited date. All packages for git known make that kind of \
information available for the whole repository. But sometimes \
you have a lot of files within the same repository in different \
versions, from different authors etc. Perhaps you also split up \
a big project in small files and want to show within the \
document who had edited what. This package gives you the \
opportunity to do so."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-2023.201.0.0.5svn51928-53.1.noarch.rpm"
RPM_HASH = "c68be05dbd7c58ed4b4120acf9f5dd5ae2485de2b02eb264d88c9fb898c87b2830c279250173be04e046c567e282d76952dea325495724ea88b26143a8a1f768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gitfile-info.sty) texlive-gitfile-info"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(currfile.sty) tex(hyperref.sty) tex(ifthen.sty) tex(tcolorbox.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
