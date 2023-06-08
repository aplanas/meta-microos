SUMMARY = "Additional EBCDIC codecs for Python"
DESCRIPTION = "Additional EBCDIC codecs for Python."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python311-ebcdic-1.1.1-2.9.noarch.rpm"
RPM_HASH = "42c36b6ccf1f1d289f5b4979f52e8b30bb82ecc156cceefc8f7fbef52b9813fd99b43101189e1165c9b6b8aa0bbe2939e23dd88a3013038b190bbf21e0f90f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ebcdic) python311-ebcdic python3dist(ebcdic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
