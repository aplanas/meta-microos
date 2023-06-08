SUMMARY = "Documentation for texlive-chkfloat"
DESCRIPTION = "This package includes the documentation for texlive-chkfloat"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27473"

RPM_NAME = "texlive-chkfloat-doc-2023.201.0.0.1svn27473-53.1.noarch.rpm"
RPM_HASH = "346aa3eecee61d3c7c33f48187a07fb3110582083fcd6a3d4e23f9dac6c9da115bb6815b65675998eb710562e35ff1d1a65c9df12e222f3e96e184db3565b7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chkfloat-doc"
RDEPENDS:${PN} += ""

inherit rpm
