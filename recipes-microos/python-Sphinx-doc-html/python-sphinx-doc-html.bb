SUMMARY = "HTML Documentation for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the HTML documentation for Sphinx."
LICENSE = "BSD-2-Clause"

PV = "7.0.0"

RPM_NAME = "python-Sphinx-doc-html-7.0.0-1.1.noarch.rpm"
RPM_HASH = "cf111540d524b9ab8697c8d23dfae6c903c4266e108517ddc72d555bf123db025d6ee98c3617b7f0140c93138a86e697853787a7e8941f3244c8b409cdc956d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-html"
RDEPENDS:${PN} += ""

inherit rpm
