SUMMARY = "PyTest plugin for testing Tornado code"
DESCRIPTION = "A pytest plugin that provides some fixtures for testing Tornado \
apps and handling of plain (undecoratored) native coroutine tests."
LICENSE = "MIT"

PV = "0.6.0.post2"

RPM_NAME = "python39-pytest-tornasync-0.6.0.post2-1.13.noarch.rpm"
RPM_HASH = "0f1a1615653b990659d5cb29270e30da8c368cf8a9c26a38baa9a95c4adea29622787d259b1fc7752a48af5f18220b5e6cc441c1ff43caabdb4fa3f87b477965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-tornasync) python39-pytest-tornasync python3dist(pytest-tornasync)"
RDEPENDS:${PN} += "python(abi) python39-base python39-pytest python39-tornado"

inherit rpm
