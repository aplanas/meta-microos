SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python311-sphinx-autodoc-typehints-1.19.2-1.3.noarch.rpm"
RPM_HASH = "96030d2e373b743229f22ab26d592bce7f3f271dc271b2ac91d76f0b1dd4f8d7c495fad1fa1363ab4840927bc3a7c060b0abe1d7d74eac6701034938db7cfc4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-autodoc-typehints) python311-sphinx-autodoc-typehints python3dist(sphinx-autodoc-typehints)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
