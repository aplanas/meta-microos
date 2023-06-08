SUMMARY = "Sphinx extension to document CLI programs"
DESCRIPTION = "This contrib extension, sphinxcontrib.autoprogram, provides an automated way to \
document CLI programs. It scans arparser.ArgumentParser object, and then expands \
it into a set of .. program:: and .. option:: directives."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python310-sphinxcontrib-autoprogram-0.1.8-2.1.noarch.rpm"
RPM_HASH = "50e5d603f9fb0e8274bce9e83ffbb99b759e0d26d0f2cb84a0186a975b0f47622946c9af4c333235ef47de48ebccb175259ffe484aa21594ae1f77914f6c62cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-autoprogram python3.10dist(sphinxcontrib-autoprogram) python310-sphinxcontrib-autoprogram python3dist(sphinxcontrib-autoprogram)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm
