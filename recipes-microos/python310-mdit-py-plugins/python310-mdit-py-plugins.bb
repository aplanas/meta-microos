SUMMARY = "Collection of plugins for markdown-it-py"
DESCRIPTION = "Collection of core plugins for markdown-it-py."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-mdit-py-plugins-0.3.0-2.3.noarch.rpm"
RPM_HASH = "a7d472c74d221251ff700f17916c66477000edba04ea2ab525acda70aa9313dfae705c7109490d0f37b4c02627539f8217a4211c379e3ff75fa8c7557435bcdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mdit-py-plugins python3.10dist(mdit-py-plugins) python310-mdit-py-plugins python3dist(mdit-py-plugins)"
RDEPENDS:${PN} += "python(abi) python310-markdown-it-py"

inherit rpm
