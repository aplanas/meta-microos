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

RPM_NAME = "python39-astral-2.2-3.10.noarch.rpm"
RPM_HASH = "5b7641997907d968a94589441b5b251beca46617a3576c0efba704dac2f012ec9b2f2e36eb5a213a3cf9e9592376f490eed9b5a8a1f4f9d94c3db9d227d657a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(astral) python39-astral python3dist(astral)"
RDEPENDS:${PN} += "python(abi) python39-pytz python39-requests"

inherit rpm
