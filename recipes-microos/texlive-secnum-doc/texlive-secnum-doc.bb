SUMMARY = "Documentation for texlive-secnum"
DESCRIPTION = "This package includes the documentation for texlive-secnum"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61813"

RPM_NAME = "texlive-secnum-doc-2023.201.svn61813-53.1.noarch.rpm"
RPM_HASH = "9235c94147c90de91c8eda0d175375a4b55e3128f5f784f8b23e1e3e1bac9aade5d98db482d5ea5375682ed4288ff1b9de748261cc4e85274e8d7932142c8ff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-secnum-doc"
RDEPENDS:${PN} += ""

inherit rpm
