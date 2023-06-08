SUMMARY = "Documentation for texlive-europasscv"
DESCRIPTION = "This package includes the documentation for texlive-europasscv"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn56829"

RPM_NAME = "texlive-europasscv-doc-2023.201.svn56829-52.1.noarch.rpm"
RPM_HASH = "b4df5d36c4f786c463346af10dbba9cb4d9d8135b46f7a408f1da6138dfa302524297050976eee656137d6cc3037e2f1bdd49c45aae9feb6dcda1cc9eaf5f7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-europasscv-doc"
RDEPENDS:${PN} += ""

inherit rpm
