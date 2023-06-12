SUMMARY = "Sphinx domain for HTTP APIs"
DESCRIPTION = "This contrib extension, sphinxcontrib.httpdomain provides a Sphinx \
domain for describing RESTful HTTP APIs. \
 \
You can find the documentation from the following URL: \
 \
https://sphinxcontrib-httpdomain.readthedocs.io/en/stable/"
LICENSE = "BSD-2-Clause"

PV = "1.8.1"

RPM_NAME = "python311-sphinxcontrib-httpdomain-1.8.1-1.1.noarch.rpm"
RPM_HASH = "52ef26af819d669f975018bc760ff525086047780fd182e07d6f4284227cf55a83b5a356cf77ec0190adbff68f5c91f9c2dc4f0c33728712bc59529db8215c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-httpdomain) \
python311-sphinxcontrib-httpdomain \
python3dist(sphinxcontrib-httpdomain)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx \
python311-six"

inherit rpm
