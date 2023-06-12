SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-sphinx-argparse-0.4.0-1.1.noarch.rpm"
RPM_HASH = "4a14140ab2b4dbc8da21bf89649acf3d5596f1feb2036c356f71e2ff5fbe771ba7c0e7f8a6771eb7146f5a949d24c1171a9b345587409535ee069019fcecae3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-argparse) python39-sphinx-argparse python3dist(sphinx-argparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
