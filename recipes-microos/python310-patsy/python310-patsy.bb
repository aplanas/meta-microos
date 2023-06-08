SUMMARY = "A Python package for statistical models and design matrices"
DESCRIPTION = "A Python package for describing statistical models and for \
building design matrices. \
It is closely inspired by and compatible with the 'formula' \
mini-language used in `R <http://www.r-project.org/>`_ and \
`S <https://secure.wikimedia.org/wikipedia/en/wiki/S_programming_language>`_."
LICENSE = "BSD-2-Clause"

PV = "0.5.3"

RPM_NAME = "python310-patsy-0.5.3-1.3.noarch.rpm"
RPM_HASH = "8b6c5fd99d74a29db15d805b3259749fd5477f59d20740b1a6a3700c1e9b7f516ce38e61bdde8c514cd4f6345ef0b2dc8a87f00040da6fef057365ef95c61057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patsy python3.10dist(patsy) python310-patsy python3dist(patsy)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-six"

inherit rpm
