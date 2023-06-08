SUMMARY = "Documentation for texlive-uvaletter"
DESCRIPTION = "This package includes the documentation for texlive-uvaletter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn66330"

RPM_NAME = "texlive-uvaletter-doc-2023.201.1.1.0svn66330-53.1.noarch.rpm"
RPM_HASH = "3f6efd14a0cf5d51aa7b178523399f8d58aad2dec68148c857bd8d99d54a13508abdc7c14ee0840ff6d51338cbaaf4a31b4c7b60ec88fd3696107d50bdbc7b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uvaletter-doc"
RDEPENDS:${PN} += ""

inherit rpm
