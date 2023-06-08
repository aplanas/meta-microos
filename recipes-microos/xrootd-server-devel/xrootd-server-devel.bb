SUMMARY = "Development files for XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD server development."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-server-devel-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "d4b7ca93ad8b73f558e8be40e5587880505e286e7e969d0796d9ddd4ff74dcc2fd3b7445b9f8eaf1b159f26336454c206ff05ae6e637d1c4e137b5b5f0f8158f"

RPROVIDES:${PN} += "xrootd-server-devel xrootd-server-devel(aarch-64)"
RDEPENDS:${PN} += "xrootd-client-devel xrootd-libs-devel xrootd-server-libs"

inherit rpm
