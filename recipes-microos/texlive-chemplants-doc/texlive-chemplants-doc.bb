SUMMARY = "Documentation for texlive-chemplants"
DESCRIPTION = "This package includes the documentation for texlive-chemplants"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.9svn60606"

RPM_NAME = "texlive-chemplants-doc-2023.201.0.0.9.9svn60606-53.1.noarch.rpm"
RPM_HASH = "03a1231599bb556619773e8cd912e6b7fcb07026a03914941777b180405375b38f0299e4f758d87b61970368f6c3583da034263322a76327423666454d9d8fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemplants-doc"
RDEPENDS:${PN} += ""

inherit rpm
