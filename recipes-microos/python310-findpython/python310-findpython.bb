SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python310-findpython-0.2.5-1.1.noarch.rpm"
RPM_HASH = "c8fb7653c9add23c2df7ab7129ba9c4371eaab53b423ba1ce6f8337afae4ea6317f0c08bb467c37e9329c8ee754da0140d9956caa77238d72e2c5668626b98ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-findpython \
python3.10dist(findpython) \
python310-findpython \
python3dist(findpython)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-packaging \
update-alternatives"

inherit rpm
