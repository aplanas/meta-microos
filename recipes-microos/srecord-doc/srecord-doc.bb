SUMMARY = "Srecord PDF documentation"
DESCRIPTION = "The srecord package is a collection of powerful tools for manipulating EPROM \
load files. It reads and writes numerous EPROM file formats, and can perform \
many different manipulations. \
 \
This package contains documentation in PDF format."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "srecord-doc-1.64-4.32.noarch.rpm"
RPM_HASH = "99dff7519e9d3a71c93578a3457813a90b42a7ee3d1a19a41bc37ecd0146540e71f5b2cd36296d09c03253f95e2eac1519ebbdae56b23dd73d3a1c42770379f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "srecord-doc"
RDEPENDS:${PN} += ""

inherit rpm
