SUMMARY = "Development headers for tolua"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "GPL-2.0+"

PV = "5.2.4"

RPM_NAME = "libtolua-devel-5.2.4-4.2.aarch64.rpm"
RPM_HASH = "f3add72ef7c68a9d246392e5cc2eac5e099862908e439d6776f93de49191e8f79202f954ea6c241c9eeff585c509ae8bc1d360ddf3234ff95e12c2357f2ab2e3"

RPROVIDES:${PN} += "libtolua-devel \
libtolua-devel(aarch-64) \
tolua-devel"
RDEPENDS:${PN} += "tolua"

inherit rpm
