SUMMARY = "Documentation for texlive-cbfonts-fd"
DESCRIPTION = "This package includes the documentation for texlive-cbfonts-fd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54080"

RPM_NAME = "texlive-cbfonts-fd-doc-2023.201.1.2svn54080-52.1.noarch.rpm"
RPM_HASH = "7735eba72523bb97bcbeffb82ebd30c23adb7b90d5890c9fec0604294783cc121c9985cfd3a99128b48c20cf3a3b42e22ded16bcecff385379283720ee143abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbfonts-fd-doc"
RDEPENDS:${PN} += ""

inherit rpm
