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

RPM_NAME = "python310-astral-2.2-3.10.noarch.rpm"
RPM_HASH = "e6e56297f4dda119a1729997b807a609e27251c847f4bbead6e1bba3e0dbc8186e282bc7640af14d240bbf10c85b98fe26e13cca77364d802298052c42926da7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-astral python3.10dist(astral) python310-astral python3dist(astral)"
RDEPENDS:${PN} += "python(abi) python310-pytz python310-requests"

inherit rpm
