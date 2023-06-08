SUMMARY = "Namecheap API client in Python"
DESCRIPTION = "Namecheap API client in Python"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-PyNamecheap-0.0.3-2.14.noarch.rpm"
RPM_HASH = "1f5339c8852c3654a901d0801e52cc7ac542d16e60bb444fd45eb1a27c2a302adc3887397bb0b3fcc275e54625ff6bdab060f00b9de177da818aa62aae2e65c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pynamecheap) python39-PyNamecheap python3dist(pynamecheap)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
