SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2022.1.2b11"

RPM_NAME = "python311-sphinx-inline-tabs-2022.1.2b11-1.3.noarch.rpm"
RPM_HASH = "98f08a7ee1b503fed04c3f42a767435e85a65d2e1deefe4d307649c06f405f9b4ff49587fa380b484aaabcdb26ef69e6e7f67d4b1f2a36117d0747589ce03674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-inline-tabs) python311-sphinx-inline-tabs python3dist(sphinx-inline-tabs)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
