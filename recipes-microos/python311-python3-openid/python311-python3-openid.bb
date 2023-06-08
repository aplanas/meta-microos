SUMMARY = "OpenID support for Python"
DESCRIPTION = "This is a set of Python packages to support the use of \
the OpenID decentralized identity system in applications. \
Includes example code and support for a variety of storage back-ends."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python311-python3-openid-3.2.0-1.13.noarch.rpm"
RPM_HASH = "66956b45c451a52824c91c3252f688982206b9d52001025a4b35878e1c368448e59f650ce5d845bce338d64ba234ff6f967bca409b97a62304844d3cbf767588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python3-openid) python311-python3-openid python3dist(python3-openid)"
RDEPENDS:${PN} += "python(abi) python311-defusedxml"

inherit rpm
