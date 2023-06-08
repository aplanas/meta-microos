SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python310-sphinx-autodoc-typehints-1.19.2-1.3.noarch.rpm"
RPM_HASH = "97fec6dd905d0c13ece4e0a875530feedac9829e7cc536937052ed99ae81288cfb6c9f33b2fc3bbe3d38b3432fc4b95ed51c23f9b739fa2f89a9edc2248ecfbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-autodoc-typehints python3.10dist(sphinx-autodoc-typehints) python310-sphinx-autodoc-typehints python3dist(sphinx-autodoc-typehints)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm
