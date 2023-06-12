SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-sphinx-argparse-0.4.0-1.1.noarch.rpm"
RPM_HASH = "3795ac5955ff38425c375fd25911ba34885330dd8d1403c89e5d668476d063eccdce5c42c8833835a84bc3c00723a5c0e7f7eb0dcc3c0db4600a01badb0593e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-argparse \
python3.10dist(sphinx-argparse) \
python310-sphinx-argparse \
python3dist(sphinx-argparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
