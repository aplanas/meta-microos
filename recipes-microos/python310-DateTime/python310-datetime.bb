SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.1"

RPM_NAME = "python310-DateTime-5.1-1.1.noarch.rpm"
RPM_HASH = "5fc973e641d5da600042daba97f78032015f4813b43ade3aaa3669fcd32573aaae6c30ec58800fb2fd2abdcf9568f300ac6dd2aee24c1a35744e829cf34086e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DateTime python3.10dist(datetime) python310-DateTime python3dist(datetime)"
RDEPENDS:${PN} += "python(abi) python310-pytz python310-zope.interface"

inherit rpm
