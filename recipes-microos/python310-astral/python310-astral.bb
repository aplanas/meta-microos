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

RPM_NAME = "python310-astral-3.2-1.1.noarch.rpm"
RPM_HASH = "c6201cc3f1e942e056b25dc86b8698cdfb8fa4c496e0a96d0b13c7fafa119108c1d917ce706dc5ef752430b6184c80b168c43fcfd838c378b2774dd8174ff01e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-astral \
python3.10dist(astral) \
python310-astral \
python3dist(astral)"
RDEPENDS:${PN} += "python(abi) \
python310-pytz \
python310-requests"

inherit rpm
