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

RPM_NAME = "python39-requests-ftp-0.3.1-3.15.noarch.rpm"
RPM_HASH = "698ae617be3364b21ac53731efa8b9fd3010533ce9b229a79a8fe895305505b08502cdc8a07e525536e34b2f7ef4b7ecbede8787ce4911ad34ffa1f50c6cd6a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-ftp) \
python39-requests-ftp \
python3dist(requests-ftp)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
