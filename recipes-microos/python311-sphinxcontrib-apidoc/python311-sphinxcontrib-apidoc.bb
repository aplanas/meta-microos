SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python311-sphinxcontrib-apidoc-0.3.0-2.1.noarch.rpm"
RPM_HASH = "ebd86c17a04756302b2b829f9f7e1a54d384249ae960169b2a3a52585d6bd8f91d8cca135839d2a90ce441727a3c37f69d34c14b7b44219cde673d9f7e61366d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-apidoc) \
python311-sphinxcontrib-apidoc \
python3dist(sphinxcontrib-apidoc)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx \
python311-pbr"

inherit rpm
