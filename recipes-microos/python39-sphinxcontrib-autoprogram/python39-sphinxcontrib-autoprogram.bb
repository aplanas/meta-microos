SUMMARY = "Sphinx extension to document CLI programs"
DESCRIPTION = "This contrib extension, sphinxcontrib.autoprogram, provides an automated way to \
document CLI programs. It scans arparser.ArgumentParser object, and then expands \
it into a set of .. program:: and .. option:: directives."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python39-sphinxcontrib-autoprogram-0.1.8-2.1.noarch.rpm"
RPM_HASH = "09c38c2d527eca11e43b8ddbb6c22aacfa85ab2e3965b579b4ce05f07fd4de4c5438b0094e8c2492166fc47c3eae62ce0755fb01db605df731354ecb73f87551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-autoprogram) python39-sphinxcontrib-autoprogram python3dist(sphinxcontrib-autoprogram)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx"

inherit rpm
