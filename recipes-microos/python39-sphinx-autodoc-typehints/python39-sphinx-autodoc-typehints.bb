SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python39-sphinx-autodoc-typehints-1.19.2-1.3.noarch.rpm"
RPM_HASH = "3c302c699e411952fb5b77dc61bf846f99ed7d8858a25c8bc4124f9224831ad11b1e0b2e09bebd7f64b123e8cc8306bb98c64aa9333918aaf89a6b6ad5639716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-autodoc-typehints) python39-sphinx-autodoc-typehints python3dist(sphinx-autodoc-typehints)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx"

inherit rpm
