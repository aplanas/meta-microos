SUMMARY = "Calculations for the position of the sun and moon"
DESCRIPTION = "This is 'astral' a Python module which calculates \
 \
* Times for various positions of the sun: dawn, sunrise, solar noon, \
  sunset, dusk, solar elevation, solar azimuth and rahukaalam. \
* The phase of the moon. \
 \
For documentation see the http://astral.readthedocs.io/en/latest/index.html"
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "python311-astral-2.2-3.10.noarch.rpm"
RPM_HASH = "fb19d8da6bf0c70eee4a1cabfa624aee45d95dd40511d8e6685c1c509be6cb327c1c864e66e45ddabf740a0efbeea86090220111ea4d42d249a3edd551350d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(astral) python311-astral python3dist(astral)"
RDEPENDS:${PN} += "python(abi) python311-pytz python311-requests"

inherit rpm
