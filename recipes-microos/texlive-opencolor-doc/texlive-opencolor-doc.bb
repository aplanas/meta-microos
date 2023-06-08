SUMMARY = "Documentation for texlive-opencolor"
DESCRIPTION = "This package includes the documentation for texlive-opencolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn66363"

RPM_NAME = "texlive-opencolor-doc-2023.201.1.0.1svn66363-54.1.noarch.rpm"
RPM_HASH = "e76c228d54dc8431d0af470275d26917937ff0ff8cfc3120eda7c7ea1d6a9db1b479f8a38e3b233195d9b7d9b6bbc5ce28b117c594a8cbf4cbce0d36f8b1584f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opencolor-doc"
RDEPENDS:${PN} += ""

inherit rpm
