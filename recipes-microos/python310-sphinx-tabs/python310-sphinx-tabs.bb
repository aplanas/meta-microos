SUMMARY = "Tabbed views for Sphinx"
DESCRIPTION = "Create tabbed content in Sphinx documentation when building HTML."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "python310-sphinx-tabs-3.4.1-1.3.noarch.rpm"
RPM_HASH = "7cec11da3498d3b68de5ee987e24953d0798285fcd9eac47f24dd88d39e813f92891bd34afce398ed5f4e841cbf4bc15aaec4fb9b5667dc354480138a93781a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-tabs \
python3.10dist(sphinx-tabs) \
python310-sphinx-tabs \
python3dist(sphinx-tabs)"
RDEPENDS:${PN} += "python(abi) \
python310-Pygments \
python310-Sphinx \
python310-docutils"

inherit rpm
