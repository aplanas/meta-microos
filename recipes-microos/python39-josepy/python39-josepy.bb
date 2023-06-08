SUMMARY = "JOSE protocol implementation in Python"
DESCRIPTION = "JOSE protocol implementation in Python using cryptography. \
It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python39-josepy-1.13.0-1.6.noarch.rpm"
RPM_HASH = "1c4b58c77192eef2c83f672d3992ef17be6b7430dbe0a8fcff3a724c15c618738b1a431a8cfdc6ee4480c7ef7f6fc936cb719056e076daf3f89489d5a5a42326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(josepy) python39-josepy python3dist(josepy)"
RDEPENDS:${PN} += "python(abi) python39-cryptography python39-pyOpenSSL"

inherit rpm
