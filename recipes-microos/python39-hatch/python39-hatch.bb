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

RPM_NAME = "python39-hatch-1.6.3-1.4.noarch.rpm"
RPM_HASH = "f6a723c933b8871d9491cd3a9b548e72f71463fe30605be65935350a6a67d0bfd3a30553b429f1016a50b0453c1e09c1df6882d4219e434c40594471e44291a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hatch) python39-hatch python3dist(hatch)"
RDEPENDS:${PN} += "(python3.9dist(pexpect) >= 4.8 with python3.9dist(pexpect) < 5) (python3.9dist(userpath) >= 1.7 with python3.9dist(userpath) < 2) /bin/sh /usr/bin/python3.9 git-core python(abi) python3.9dist(click) python3.9dist(hatchling) python3.9dist(httpx) python3.9dist(hyperlink) python3.9dist(keyring) python3.9dist(packaging) python3.9dist(platformdirs) python3.9dist(pyperclip) python3.9dist(rich) python3.9dist(shellingham) python3.9dist(tomli-w) python3.9dist(tomlkit) python3.9dist(virtualenv) update-alternatives"

inherit rpm
