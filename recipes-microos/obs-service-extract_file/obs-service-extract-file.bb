SUMMARY = "An OBS source service: Extract a file from an archive"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports to extract a file from an archive, for example a spec file from a tar."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "obs-service-extract_file-0.4-1.10.noarch.rpm"
RPM_HASH = "9e3ae9efecabd0de32e6a7f14fdd3486762a31cd46d5604f3269c6794829d8b10052715fc9a7148858fecee65dc99c897a4a17351f4d7b3e3481b55cd26b57e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-extract_file"
RDEPENDS:${PN} += "/bin/bash bzip2 gzip tar unzip xz"

inherit rpm
