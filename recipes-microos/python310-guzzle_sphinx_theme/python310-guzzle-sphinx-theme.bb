SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python310-guzzle_sphinx_theme-0.7.11-2.15.noarch.rpm"
RPM_HASH = "9e28d0c4200c38f530461733bee3f87a710671d98662425c82abf78dfea2d41232dbc75eaf5f9b63b49769c98f7cd331fbb381372c455badf15284c529227c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-guzzle_sphinx_theme \
python3.10dist(guzzle-sphinx-theme) \
python310-guzzle_sphinx_theme \
python3dist(guzzle-sphinx-theme)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
