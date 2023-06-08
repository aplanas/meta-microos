SUMMARY = "Documentation for texlive-guitlogo"
DESCRIPTION = "This package includes the documentation for texlive-guitlogo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0_alpha.4svn55741"

RPM_NAME = "texlive-guitlogo-doc-2023.201.1.0.0_alpha.4svn55741-53.1.noarch.rpm"
RPM_HASH = "e9b85f3a06b0f7ce46f1d5f76c090e27baf62e89a8f4d360e3fd403c23f9bf1ee8c235ff139af9401634be9e3e368692f4f7821962682a904cec53fb545c2134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-guitlogo-doc:it) texlive-guitlogo-doc"
RDEPENDS:${PN} += ""

inherit rpm
