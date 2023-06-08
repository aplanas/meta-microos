SUMMARY = "Documentation for texlive-augie"
DESCRIPTION = "This package includes the documentation for texlive-augie"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-augie-doc-2023.201.svn61719-53.1.noarch.rpm"
RPM_HASH = "bd6fb0d41e3e66414dd2c6a1173d4be0086a93e66696d1732d0f3197d1b1df5360f2167e1cbde321f832601613e05d06b4a97fd121dc84057ae810dd8cc8947a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-augie-doc"
RDEPENDS:${PN} += ""

inherit rpm
