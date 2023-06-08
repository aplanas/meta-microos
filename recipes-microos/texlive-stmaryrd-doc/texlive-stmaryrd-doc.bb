SUMMARY = "Documentation for texlive-stmaryrd"
DESCRIPTION = "This package includes the documentation for texlive-stmaryrd"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22027"

RPM_NAME = "texlive-stmaryrd-doc-2023.201.svn22027-57.1.noarch.rpm"
RPM_HASH = "c878872b922d4526baf0e0bce85162393f2f2c0036a84b3484a62661c8c01e3171ddf6d7288e10c926fd4da9579fed6c3dda552e065949e34f95b66c171180ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stmaryrd-doc"
RDEPENDS:${PN} += ""

inherit rpm
