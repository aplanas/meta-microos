SUMMARY = "Python library for working with date and datetime objects"
DESCRIPTION = "Python library for working with date and datetime objects."
LICENSE = "0BSD"

PV = "0.6.12"

RPM_NAME = "python39-dateutils-0.6.12-1.3.noarch.rpm"
RPM_HASH = "4a482e473186ebc68754d54c4990cc0931a86b53a72934442f942e45e789a79a5db4d6984f6a95f939826d9e15782577874207991e81866ca528120086a45468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dateutils) python39-dateutils python3dist(dateutils)"
RDEPENDS:${PN} += "python(abi) python39-python-dateutil python39-pytz"

inherit rpm
