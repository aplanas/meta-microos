SUMMARY = "Development files for XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD development."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-libs-devel-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "1b9eb9fe8ff36a516e5345685fc9d5e9bf04b2b0a3b9e66e9e2f08af5e3cd3ab0406fa22f33e1d0d0f49f259cdf3c85082233d41a13a6dcc352a11ef609f3044"

RPROVIDES:${PN} += "xrootd-libs-devel xrootd-libs-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash xrootd-libs"

inherit rpm
