SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.1"

RPM_NAME = "python39-DateTime-5.1-1.1.noarch.rpm"
RPM_HASH = "e919195281ac8a3e427b8cb396582a5c40ea586b8252f9ad08d64ed83ed375526b87b94b66634a417acfa282af4e965a063da72a599bc80dbb9ce83e84db6aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(datetime) python39-DateTime python3dist(datetime)"
RDEPENDS:${PN} += "python(abi) python39-pytz python39-zope.interface"

inherit rpm
