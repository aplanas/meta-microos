SUMMARY = "Documentation for texlive-exam-zh"
DESCRIPTION = "This package includes the documentation for texlive-exam-zh"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.20svn64434"

RPM_NAME = "texlive-exam-zh-doc-2023.201.0.0.1.20svn64434-52.1.noarch.rpm"
RPM_HASH = "3d77928b54f1678db32df8f64f7ede344f2164b45cfda90d8e197d2112793f26961fc373c23dba28d1dca6c3e4a955684c28ff2f8dbfcfc310474b861759068c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-zh-doc"
RDEPENDS:${PN} += ""

inherit rpm
