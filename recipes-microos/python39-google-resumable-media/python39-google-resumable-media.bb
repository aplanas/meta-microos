SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "python39-google-resumable-media-2.4.1-1.2.noarch.rpm"
RPM_HASH = "9c287d0c7bdcc8b5aa2fc11e5742685b884de380159683b0d31cdf1e751ca8aa67e41a94345d8c90830f801024731b6ea879192e45ec3f23a703ebd0722c2f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-resumable-media) python39-google-resumable-media python3dist(google-resumable-media)"
RDEPENDS:${PN} += "python(abi) python39-google-crc32c"

inherit rpm
