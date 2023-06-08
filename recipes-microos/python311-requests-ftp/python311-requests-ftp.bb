SUMMARY = "FTP Transport Adapter for Requests"
DESCRIPTION = "Requests-FTP is an implementation of a very stupid FTP transport adapter for \
use with the `Requests` Python library. \
 \
This library is *not* intended to be an example of Transport Adapters best \
practices. This library was cowboyed together in about 4 hours of total work, \
has no tests, and relies on a few ugly hacks. Instead, it is intended as both \
a starting point for future development and an example for how to \
implement transport adapters."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python311-requests-ftp-0.3.1-3.15.noarch.rpm"
RPM_HASH = "ef2f1b58e67de0c85f8840b695ca7941c6381897fb9b33da22163e963791687b6a556c6ba246e4ddfa3e38d7eb58e4448b5da75e38e6788a1df34a036ed1bc75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-ftp) python311-requests-ftp python3dist(requests-ftp)"
RDEPENDS:${PN} += "python(abi) python311-requests"

inherit rpm
