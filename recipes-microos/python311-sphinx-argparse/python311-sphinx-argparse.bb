SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-sphinx-argparse-0.3.2-1.3.noarch.rpm"
RPM_HASH = "591e6b121f3729f828726ee35c5009ca2ba40d75c5a8a9d54e205f03981c20d1fe214ed346e9986cf050e0494e2b0687309321814207e96318620d03611972e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-argparse) python311-sphinx-argparse python3dist(sphinx-argparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
