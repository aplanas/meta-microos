SUMMARY = "Memoir-based class for formatting University of Auckland masters' and doctors' theses"
DESCRIPTION = "A memoir-based class for formatting University of Auckland \
masters' and doctors' thesis dissertations in any discipline. \
The title page does not handle short dissertations for \
diplomas."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn51323"

RPM_NAME = "texlive-aucklandthesis-2023.201.svn51323-53.1.noarch.rpm"
RPM_HASH = "8c0ac2aa0e871f9ccacac0924745563c7c8e42e2d4f963a11710d6fde7cf4d462b150bb34f583b8f5ba366b4440a6589d2825e6997e1d1619fc08e950b0130c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(aucklandthesis.cls) texlive-aucklandthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(memoir.cls) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
