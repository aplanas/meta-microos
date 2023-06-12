SUMMARY = "Type hints (PEP 484) support for the Sphinx autodoc extension"
DESCRIPTION = "This is a Sphinx extension which allows to use Python 3 annotations for documenting acceptable argument types \
and return value types of functions."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "python39-sphinx-autodoc-typehints-1.19.2-1.4.noarch.rpm"
RPM_HASH = "3e2e557a1ef6163e70e649eafa94cd28b2be0030e363cabc3a910567a007f85b5827aa8fc9857edc3fe4b3dc8737ee01a87f4bd58ca67b4514c5e47ca18d637f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-autodoc-typehints) python39-sphinx-autodoc-typehints python3dist(sphinx-autodoc-typehints)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx"

inherit rpm
