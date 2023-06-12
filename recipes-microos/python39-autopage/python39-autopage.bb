SUMMARY = "A library to provide automatic paging for console output"
DESCRIPTION = "Autopage is a Python library to \
automatically display terminal output from a program \
in a pager (like `less`)"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-autopage-0.5.1-3.3.noarch.rpm"
RPM_HASH = "eec44e6d3d9aa74627110b7552aa569888e9ada96b662d95ca91d46cee620ff17aeffb54351a1cfc8d1f4f868a6b71778ca404de85c821d02b7055b8b905a652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(autopage) \
python39-autopage \
python3dist(autopage)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
