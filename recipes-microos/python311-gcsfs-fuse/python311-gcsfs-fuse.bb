SUMMARY = "Filesystem interface over GCS - FUSE interface"
DESCRIPTION = "File-system interface for Google Cloud Storage. \
 \
This package provides the optional FUSE interface."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python311-gcsfs-fuse-2023.3.0-1.2.noarch.rpm"
RPM_HASH = "6b74f6b95de5f8029289c8f097394c6ef4edf4364e7e5ada95c8bae57fa02e366a187bd063fade5e48a75139e6ccab15b41a77589337fadb8a3e3315cc982691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-gcsfs-fuse"
RDEPENDS:${PN} += "python(abi) python311-click python311-fusepy"

inherit rpm
