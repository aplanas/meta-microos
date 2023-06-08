SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python39-aiounittest-1.4.2-1.3.noarch.rpm"
RPM_HASH = "38412340f0216df1dcb74f23538b67a6e03b206ab64c4d9922b86754a77490a6e5885b5d9324b399b0eb737dd4690e433148549ee1d7f7e630aef4399c7dd272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiounittest) python39-aiounittest python3dist(aiounittest)"
RDEPENDS:${PN} += "python(abi) python39-wrapt"

inherit rpm
