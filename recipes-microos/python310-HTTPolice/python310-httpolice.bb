SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-HTTPolice-0.9.0-4.14.noarch.rpm"
RPM_HASH = "8b46661efb6b360b062ed1f7a5a646c3e4f260572bc379a09123631cf1bc63c0c35e3de05c595b7f02ff1fe8258aa45ac8cf6ab5981ac7912d26482bad79cad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-HTTPolice python3.10dist(httpolice) python310-HTTPolice python3dist(httpolice)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Brotli python310-bitstring python310-defusedxml python310-dominate python310-lxml update-alternatives"

inherit rpm
