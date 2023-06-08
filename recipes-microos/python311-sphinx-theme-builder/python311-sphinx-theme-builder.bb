SUMMARY = "A tool for authoring Sphinx themes with a simple (opinionated) workflow"
DESCRIPTION = "Streamline the Sphinx theme development workflow, by building upon \
existing standardised tools. \
 \
 * simplified packaging experience \
 * simplified JavaScript tooling setup \
 * development server, with rebuild-on-save and automagical browser reloading \
 * consistent repository structure across themes"
LICENSE = "MIT"

PV = "0.2.0b1"

RPM_NAME = "python311-sphinx-theme-builder-0.2.0b1-1.2.noarch.rpm"
RPM_HASH = "85bd46dede600da268a88ad5199bcec80ad0ced7e679fba99bde4ba3e193ecac99d78ac3a655e0a0eff0d351b7c1f8cb78f91c403cf94d6f509460ca9c5747ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-theme-builder) python311-sphinx-theme-builder python3dist(sphinx-theme-builder)"
RDEPENDS:${PN} += "(python311-tomli if python311-base < 3.11) /bin/sh /usr/bin/python3.11 python(abi) python311-click python311-nodeenv python311-packaging python311-pyproject-metadata python311-rich python311-setuptools update-alternatives"

inherit rpm
