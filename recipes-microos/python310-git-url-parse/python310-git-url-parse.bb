SUMMARY = "A GIT URL parser for Python"
DESCRIPTION = "git-url-parse is a GIT URL parser."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python310-git-url-parse-1.2.2-1.14.noarch.rpm"
RPM_HASH = "a1dea0a048bcdd1c2f404028ed5dfb661fe1e98f340c86ce4e06d1a2f8d77296295c4fd2ce43e41c32a64456a5c7ae828939e9f84899d66296f8a5eedc4c7186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-git-url-parse \
python3.10dist(git-url-parse) \
python310-git-url-parse \
python3dist(git-url-parse)"
RDEPENDS:${PN} += "python(abi) \
python310-pbr"

inherit rpm
