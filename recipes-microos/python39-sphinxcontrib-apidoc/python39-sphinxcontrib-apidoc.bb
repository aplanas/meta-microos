SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python39-sphinxcontrib-apidoc-0.3.0-2.1.noarch.rpm"
RPM_HASH = "9fbc491cb41b722b4c8b7d10adccb699192c2921d60fe01f0f724c1e1c4772a067eba7ff895f1ec532558fa85f8f1ac0945eacc6d54d09776cc1a57aed2add12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-apidoc) python39-sphinxcontrib-apidoc python3dist(sphinxcontrib-apidoc)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx python39-pbr"

inherit rpm
