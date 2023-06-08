SUMMARY = "Mako template bindings for the Pyramid web framework"
DESCRIPTION = "Mako template bindings for the Pyramid web framework."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-pyramid-mako-1.1.0-3.8.noarch.rpm"
RPM_HASH = "e19482f3b34032960aee8a6c05e9bfb26e07c732ecd5d77595ba3ad72462338ac92dff62d4e3b4f6e813117c16ea2369fafe2b8560b3f56a984c93d55493fed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyramid-mako) python39-pyramid-mako python3dist(pyramid-mako)"
RDEPENDS:${PN} += "python(abi) python39-Mako python39-pyramid"

inherit rpm
