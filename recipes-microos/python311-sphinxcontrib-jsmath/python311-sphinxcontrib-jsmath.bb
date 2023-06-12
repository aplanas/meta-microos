SUMMARY = "Sphinx extension which renders display math in HTML via JavaScript"
DESCRIPTION = "sphinxcontrib-jsmath is a sphinx extension which renders display math in HTML \
via JavaScript."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python311-sphinxcontrib-jsmath-1.0.1-4.1.noarch.rpm"
RPM_HASH = "d4132eba2e18acc600c33a5d625782efd4e6d3fd1b9cbc2d0937bc124a29a48255b451407958e1d97cf2814c24c8e0b6e8605bc6043ef48b9667c412fe0b8309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-jsmath) \
python311-sphinxcontrib-jsmath \
python3dist(sphinxcontrib-jsmath)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
