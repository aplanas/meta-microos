SUMMARY = "Documentation files for python-shodan"
DESCRIPTION = "HTML documentation on the API and examples for python-shodan."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python-shodan-doc-1.28.0-1.4.noarch.rpm"
RPM_HASH = "f0bbac4204db0383779fbd05ac3790d55f9b8756b2e4e8be6c4c9b133431c223b7c4e8eef01ecb18004dc368188a6aed44d2478ce972dde93a28ef4775223821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-shodan-doc python310-shodan-doc python311-shodan-doc python39-shodan-doc"
RDEPENDS:${PN} += ""

inherit rpm
