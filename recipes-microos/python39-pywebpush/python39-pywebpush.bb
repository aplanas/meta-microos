SUMMARY = "WebPush publication library"
DESCRIPTION = "WebPush publication library."
LICENSE = "MPL-2.0"

PV = "1.14.0"

RPM_NAME = "python39-pywebpush-1.14.0-2.6.noarch.rpm"
RPM_HASH = "25fe50e6cc9de7332ecc32575a4ad28442af8545ded653a624954e3e04aefb0ae676d766b95b6090b2b9922475153a3e5d53985175cb28b13514267e9f125b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pywebpush) python39-pywebpush python3dist(pywebpush)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-cryptography python39-http-ece python39-py-vapid python39-requests update-alternatives"

inherit rpm
