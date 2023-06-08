SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2022.1.2b11"

RPM_NAME = "python39-sphinx-inline-tabs-2022.1.2b11-1.3.noarch.rpm"
RPM_HASH = "89ac80690bb70e8e6fea97778f39bf40f4dc54f1457d102fdcccd79913b2304be1bba5ddeaf7fcf14bb962b1c1b85d59eee0e816e64e3ee48d8cc64cf516c90f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-inline-tabs) python39-sphinx-inline-tabs python3dist(sphinx-inline-tabs)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx"

inherit rpm
