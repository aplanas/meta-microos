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

PV = "1.7.0"

RPM_NAME = "python311-hatch-1.7.0-1.1.noarch.rpm"
RPM_HASH = "4485ec89ab045ab97f2ed4b9cb237e179c5a83b86df99bf525edcc9ba4c20a4510ce8fae9236d8c4f04adfa0999bb72bd8f796950282461b57ee6fb7911bd382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatch) python311-hatch python3dist(hatch)"
RDEPENDS:${PN} += "(python3.11dist(pexpect) >= 4.8 with python3.11dist(pexpect) < 5) (python3.11dist(userpath) >= 1.7 with python3.11dist(userpath) < 2) /bin/sh /usr/bin/python3.11 git-core python(abi) python3.11dist(click) python3.11dist(hatchling) python3.11dist(httpx) python3.11dist(hyperlink) python3.11dist(keyring) python3.11dist(packaging) python3.11dist(platformdirs) python3.11dist(pyperclip) python3.11dist(rich) python3.11dist(shellingham) python3.11dist(tomli-w) python3.11dist(tomlkit) python3.11dist(virtualenv) update-alternatives"

inherit rpm
