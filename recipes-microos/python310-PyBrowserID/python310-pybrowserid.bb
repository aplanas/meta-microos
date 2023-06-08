SUMMARY = "Python library for the BrowserID Protocol"
DESCRIPTION = "This is a python client library for the BrowserID protocol that underlies \
Mozilla Persona."
LICENSE = "MPL-2.0"

PV = "0.14.0"

RPM_NAME = "python310-PyBrowserID-0.14.0-4.8.noarch.rpm"
RPM_HASH = "2295caf538e7e052e61b22b7d08e5a3a35227c73948cdf92be5d50a82ee0cd774f57d4a7e791f5d3aa84078bbbb8e007b183c18e7c9f2028f07d5a4855cd04db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyBrowserID python3.10dist(pybrowserid) python310-PyBrowserID python3dist(pybrowserid)"
RDEPENDS:${PN} += "python(abi) python310-requests"

inherit rpm
