SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.8.15"

RPM_NAME = "python311-cloudflare-2.8.15-1.7.noarch.rpm"
RPM_HASH = "866c0053d4a67c6be3cac6bdfe0e53b832f762cc419ae8bde4f907bd0f4cfda14ebd5be0d89eeef938d3ccfcd205b1c5996f424fc8c3c2c39d4f25bc07215190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cloudflare) python311-cloudflare python3dist(cloudflare)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-beautifulsoup4 python311-future python311-jsonlines python311-requests update-alternatives"

inherit rpm
