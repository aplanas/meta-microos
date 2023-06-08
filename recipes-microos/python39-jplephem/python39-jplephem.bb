SUMMARY = "Planet position predictor using a JPL ephemeris"
DESCRIPTION = "This package can load and use a Jet Propulsion Laboratory (JPL) \
ephemeris for predicting the position and velocity of a planet or other \
Solar System body.  It only needs NumPy <http://www.numpy.org/>`."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "python39-jplephem-2.15-2.9.noarch.rpm"
RPM_HASH = "ca73447c5ae6448830fc9fa28b9ba99e246737442d89f5387b47890e7500912704186db9d6e85b20d584406869521afb7fa02ae5cbec26e06b3fcd4bc98007c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jplephem) python39-jplephem python3dist(jplephem)"
RDEPENDS:${PN} += "python(abi) python39-numpy"

inherit rpm
