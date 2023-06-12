SUMMARY = "Documentation for texlive-xebaposter"
DESCRIPTION = "This package includes the documentation for texlive-xebaposter"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.53svn63513"

RPM_NAME = "texlive-xebaposter-doc-2023.201.2.53svn63513-52.1.noarch.rpm"
RPM_HASH = "531d2afb4ed21cea04589eb795d527659923542a714c62f4e882d3d83204467894f43fabca763945597ac214942659b1f5c15f7d65831b6689707dda0603c832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xebaposter-doc:fa) \
texlive-xebaposter-doc"
RDEPENDS:${PN} += ""

inherit rpm
