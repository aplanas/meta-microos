SUMMARY = "OpenID support for Python"
DESCRIPTION = "This is a set of Python packages to support the use of \
the OpenID decentralized identity system in applications. \
Includes example code and support for a variety of storage back-ends."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python310-python3-openid-3.2.0-1.13.noarch.rpm"
RPM_HASH = "945c23b4daf8cadc041e43c80a649d97297520477cf449fca8924bdfbf69783b48d76ec223137084d4acf659bf86a3b53a69bc9f310e7680c9ff2b4dfd6e9e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python3-openid \
python3.10dist(python3-openid) \
python310-python3-openid \
python3dist(python3-openid)"
RDEPENDS:${PN} += "python(abi) \
python310-defusedxml"

inherit rpm
