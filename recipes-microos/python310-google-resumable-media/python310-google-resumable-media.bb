SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "python310-google-resumable-media-2.4.1-1.2.noarch.rpm"
RPM_HASH = "1895872eccc2f2f8c6181596b544a401e601c8889a4b50b644f5ea46b7803bbae21e3c902dad69d91d2403f0807e16f76a19710e0dbe31cb8ac8899db0ee4ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-resumable-media python3.10dist(google-resumable-media) python310-google-resumable-media python3dist(google-resumable-media)"
RDEPENDS:${PN} += "python(abi) python310-google-crc32c"

inherit rpm
