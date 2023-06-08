SUMMARY = "Building newsfiles for your project"
DESCRIPTION = "Building newsfiles for your project."
LICENSE = "MIT"

PV = "19.2.0"

RPM_NAME = "python311-towncrier-19.2.0-2.13.noarch.rpm"
RPM_HASH = "e8b12fdf7b57d7153b8db0b245b913d228a0966191967661dab1b3c1317bc8220d0fa831b1fde5bb7e626e815b39813b9ae023257627b9675766d27625383ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(towncrier) python311-towncrier python3dist(towncrier)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 git-core python(abi) python311-Jinja2 python311-click python311-incremental python311-toml update-alternatives"

inherit rpm
