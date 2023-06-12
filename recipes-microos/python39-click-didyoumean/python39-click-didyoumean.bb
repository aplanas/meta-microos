SUMMARY = "Plugin to enable git-like did-you-mean feature in python-click"
DESCRIPTION = "This package enables a git-like did-you-mean feature in click."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-click-didyoumean-0.0.3-4.12.noarch.rpm"
RPM_HASH = "f677a7e696846b315046560812e99c141fdb20da1e8234def6e819ac699a38d7f678e9cd1d45ba413ae85e8c95f53809fb79ebf3eaae307d69a091bdc506e403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-didyoumean) \
python39-click-didyoumean \
python3dist(click-didyoumean)"
RDEPENDS:${PN} += "python(abi) \
python39-click"

inherit rpm
