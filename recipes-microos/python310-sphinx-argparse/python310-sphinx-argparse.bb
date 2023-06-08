SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-sphinx-argparse-0.3.2-1.3.noarch.rpm"
RPM_HASH = "eeeb7c32c940357a5e6ab4064ca00030497390fd4b1fbe8984f49ce4175e51a2cac691e1c418cfdca8279a22331c91612130f4fbfdf5f8a982499b398e055832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-argparse python3.10dist(sphinx-argparse) python310-sphinx-argparse python3dist(sphinx-argparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
