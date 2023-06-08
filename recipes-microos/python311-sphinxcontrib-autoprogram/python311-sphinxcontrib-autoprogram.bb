SUMMARY = "Sphinx extension to document CLI programs"
DESCRIPTION = "This contrib extension, sphinxcontrib.autoprogram, provides an automated way to \
document CLI programs. It scans arparser.ArgumentParser object, and then expands \
it into a set of .. program:: and .. option:: directives."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python311-sphinxcontrib-autoprogram-0.1.8-2.1.noarch.rpm"
RPM_HASH = "2d2011741a65213fc6ce09c42dd8ca814b76552a4624289c959c9e10ecaafe2c7c5d24c62e5790d1ea55a5435c221ef4b137035a1f22974ae7b1b88c43a77c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-autoprogram) python311-sphinxcontrib-autoprogram python3dist(sphinxcontrib-autoprogram)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
