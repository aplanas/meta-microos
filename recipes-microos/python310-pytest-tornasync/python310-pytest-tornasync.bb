SUMMARY = "PyTest plugin for testing Tornado code"
DESCRIPTION = "A pytest plugin that provides some fixtures for testing Tornado \
apps and handling of plain (undecoratored) native coroutine tests."
LICENSE = "MIT"

PV = "0.6.0.post2"

RPM_NAME = "python310-pytest-tornasync-0.6.0.post2-1.13.noarch.rpm"
RPM_HASH = "8efc6fa020ba9938933fa73bec5a27e0c4abffe4b00fa48fd8ebea15fd75a3859be841917cc06709bde0d599853d7d5ccc7b0da62232ac6c14201b404dc6a384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tornasync python3.10dist(pytest-tornasync) python310-pytest-tornasync python3dist(pytest-tornasync)"
RDEPENDS:${PN} += "python(abi) python310-base python310-pytest python310-tornado"

inherit rpm
