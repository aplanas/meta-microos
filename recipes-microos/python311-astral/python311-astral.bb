SUMMARY = "Calculations for the position of the sun and moon"
DESCRIPTION = "This is 'astral' a Python module which calculates \
 \
* Times for various positions of the sun: dawn, sunrise, solar noon, \
  sunset, dusk, solar elevation, solar azimuth and rahukaalam. \
* The phase of the moon. \
 \
For documentation see the http://astral.readthedocs.io/en/latest/index.html"
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "python311-astral-3.2-1.1.noarch.rpm"
RPM_HASH = "3dabe21b0d8ea27145dcdebc6c7ffd0c20ab7c0e57e0bfab3e1e4967648f2eff0660ca4db5e92faf14fe5dd1f2e36568dce63b756faa4773941a356d3a15d3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(astral) \
python311-astral \
python3dist(astral)"
RDEPENDS:${PN} += "python(abi) \
python311-pytz \
python311-requests"

inherit rpm
