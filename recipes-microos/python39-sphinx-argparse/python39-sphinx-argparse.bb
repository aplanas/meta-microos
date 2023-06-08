SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-sphinx-argparse-0.3.2-1.3.noarch.rpm"
RPM_HASH = "6bcf0c756d2499eb40a8a1717e76ccda05760e2f3722444b9a0ddbf7b8f65c36e7747ea53330b131fd70cdd5a45354ed0d0c18780ffc13b3db5a6093a8799d17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-argparse) python39-sphinx-argparse python3dist(sphinx-argparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
