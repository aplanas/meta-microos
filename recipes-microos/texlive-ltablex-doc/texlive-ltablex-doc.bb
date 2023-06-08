SUMMARY = "Documentation for texlive-ltablex"
DESCRIPTION = "This package includes the documentation for texlive-ltablex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34923"

RPM_NAME = "texlive-ltablex-doc-2023.201.1.1svn34923-52.1.noarch.rpm"
RPM_HASH = "1039cab9d26b48a79cfe50fb7bb6bb0bb3f16105604660af119f2ff3d21250e0c805cbb0f51d326d6b4c30440626ae232db0ffaaaeb9a4518b4936cd770fbf89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltablex-doc"
RDEPENDS:${PN} += ""

inherit rpm
