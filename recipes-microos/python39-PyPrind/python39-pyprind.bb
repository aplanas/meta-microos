SUMMARY = "Python progress bar and percent indicator utility"
DESCRIPTION = "The PyPrind (Python Progress Indicator) module provides a progress \
bar and a percentage indicator object that let track the progress \
of a loop structure or other iterative computation. \
A typical application is the processing of large data sets for \
which to provide an intuitive estimate at runtime about the \
computation progress."
LICENSE = "BSD-3-Clause"

PV = "2.11.3"

RPM_NAME = "python39-PyPrind-2.11.3-1.3.noarch.rpm"
RPM_HASH = "51ea1f24c401a7ee4b80fe9c77f0d84b330ef1a2f7af3300c07de1534794f92119c79a17e93e531da4ca940fff681d42e778242eceb9897decefbca009e9cfba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyprind) \
python39-PyPrind \
python3dist(pyprind)"
RDEPENDS:${PN} += "python(abi) \
python39-psutil"

inherit rpm
