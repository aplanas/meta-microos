SUMMARY = "Python module for running a TLS server with Twisted"
DESCRIPTION = "This package brings support for running a TLS server with Twisted."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-TxSNI-0.2.0-3.4.noarch.rpm"
RPM_HASH = "eacca5c9e79f20e8f37c05eefa05465a2e00b83925b78246096339680616d0451666466ac86cc5ac2d429508378497fdda857ac164f61a51c4fe73efa3406609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TxSNI python3.10dist(txsni) python310-TxSNI python3dist(txsni)"
RDEPENDS:${PN} += "python(abi) python310-Twisted-tls python310-pyOpenSSL"

inherit rpm
