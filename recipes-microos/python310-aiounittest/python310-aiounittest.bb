SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python310-aiounittest-1.4.2-2.1.noarch.rpm"
RPM_HASH = "cddbe2a40d892fe11b541f3cbda9798a3aaf3918bb2131ab782d334e672c238d2e98435d9c2c1b8bf0d86f73846a40d735e586ea924d63f0a11e9a737227f9fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiounittest \
python3.10dist(aiounittest) \
python310-aiounittest \
python3dist(aiounittest)"
RDEPENDS:${PN} += "python(abi) \
python310-wrapt"

inherit rpm
