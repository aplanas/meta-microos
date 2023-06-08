SUMMARY = "Sphinx extension to support docstrings in Numpy format"
DESCRIPTION = "Numpy's documentation uses several custom extensions to Sphinx.  These \
are shipped in this numpydoc package, in case you want to make use \
of them in third-party projects."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python310-numpydoc-1.5.0-1.3.noarch.rpm"
RPM_HASH = "49b6679737adf59997b779cb1282493212643a81770a45f325d665adedab6831560a7cb1a646d1421ca3ed210cddd2203e73046d38b85addb8a229a8005dd3d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-numpydoc python3.10dist(numpydoc) python310-numpydoc python3dist(numpydoc)"
RDEPENDS:${PN} += "python(abi) python310-Jinja2 python310-Sphinx"

inherit rpm
