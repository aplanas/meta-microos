SUMMARY = "Modern, extensible Python project management"
DESCRIPTION = "Hatch is a modern, extensible Python project manager. \
 \
Features \
  * Standardized build system with reproducible builds by default \
  * Robust environment management with support for custom scripts \
  * Easy publishing to PyPI or other indexes \
  * Version management \
  * Configurable project generation with sane defaults \
  * Responsive CLI, ~2-3x faster than equivalent tools"
LICENSE = "MIT"

PV = "1.6.3"

RPM_NAME = "python311-hatch-1.6.3-1.4.noarch.rpm"
RPM_HASH = "8ed95b6ade1cda5ce4e38b04c726d76291d7f48fe47fda3e3f3edf23934bf5e8ef02295d3bcef4814c9f80d18e722d406c39e00b5026a24b9f6706d332c21a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatch) python311-hatch python3dist(hatch)"
RDEPENDS:${PN} += "(python3.11dist(pexpect) >= 4.8 with python3.11dist(pexpect) < 5) (python3.11dist(userpath) >= 1.7 with python3.11dist(userpath) < 2) /bin/sh /usr/bin/python3.11 git-core python(abi) python3.11dist(click) python3.11dist(hatchling) python3.11dist(httpx) python3.11dist(hyperlink) python3.11dist(keyring) python3.11dist(packaging) python3.11dist(platformdirs) python3.11dist(pyperclip) python3.11dist(rich) python3.11dist(shellingham) python3.11dist(tomli-w) python3.11dist(tomlkit) python3.11dist(virtualenv) update-alternatives"

inherit rpm
