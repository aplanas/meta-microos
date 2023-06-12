SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python39-google-resumable-media-2.5.0-1.1.noarch.rpm"
RPM_HASH = "59438ab36cd0646220634fc543c9c9f035f88c11699ba954b30f675df396664a4f31bb87627d0c44a2cac63beb75527461e525e830f5c19bff3df2b6b53065a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-resumable-media) python39-google-resumable-media python3dist(google-resumable-media)"
RDEPENDS:${PN} += "python(abi) python39-google-crc32c"

inherit rpm
