SUMMARY = "Documentation for texlive-c90"
DESCRIPTION = "This package includes the documentation for texlive-c90"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60830"

RPM_NAME = "texlive-c90-doc-2023.201.svn60830-52.1.noarch.rpm"
RPM_HASH = "39f33ca7665dc0f53f2f02002e6dfdd7f4fcd26ec9feadee54d6a0e089d380bccf3e76cf5bbf3a228d49bca70a235109e88fcf652a53b79de0154dcb3401d26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-c90-doc"
RDEPENDS:${PN} += ""

inherit rpm
