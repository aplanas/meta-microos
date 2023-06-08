SUMMARY = "A Python package for statistical models and design matrices"
DESCRIPTION = "A Python package for describing statistical models and for \
building design matrices. \
It is closely inspired by and compatible with the 'formula' \
mini-language used in `R <http://www.r-project.org/>`_ and \
`S <https://secure.wikimedia.org/wikipedia/en/wiki/S_programming_language>`_."
LICENSE = "BSD-2-Clause"

PV = "0.5.3"

RPM_NAME = "python311-patsy-0.5.3-1.3.noarch.rpm"
RPM_HASH = "50e2da3960bf97a1d8fe4fc6604cce6f156484a628fd8fbc6769704e306038f5b90f10d6a8c313623da517131b0d316083103e61d6d799a6d56ded979e18c8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(patsy) python311-patsy python3dist(patsy)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-six"

inherit rpm
