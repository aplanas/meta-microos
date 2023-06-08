SUMMARY = "OpenAFS Kernel Module source tree"
DESCRIPTION = "The AFS distributed filesystem.  AFS is a distributed filesystem \
allowing cross-platform sharing of files among multiple computers. \
Facilities are provided for access control, authentication, backup and \
administrative management. \
 \
This package provides the source code to build your own AFS kernel \
module."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-kernel-source-1.8.9-2.9.noarch.rpm"
RPM_HASH = "11519f0f24d9202ff5403a6bdf2f0d4f64dbaf0a67e6d535717b0eb6d4ebbca8c7825bebc68f4cab354c94ae4317914783d7fbdb103393fa4a03dcc0ed6378e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openafs-kernel openafs-kernel-source"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl bison flex gcc kernel-devel"

inherit rpm
