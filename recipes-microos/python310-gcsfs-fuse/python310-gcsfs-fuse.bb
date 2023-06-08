SUMMARY = "Filesystem interface over GCS - FUSE interface"
DESCRIPTION = "File-system interface for Google Cloud Storage. \
 \
This package provides the optional FUSE interface."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python310-gcsfs-fuse-2023.3.0-1.2.noarch.rpm"
RPM_HASH = "c8c633188c017abb0decf6497ea416108bfd1ffdc4cd64bf218733a95e69c6ccbf4aecf79eea260347a2f9e8ccc0142dee498da586659c75177edd438b998eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gcsfs-fuse python310-gcsfs-fuse"
RDEPENDS:${PN} += "python(abi) python310-click python310-fusepy"

inherit rpm
