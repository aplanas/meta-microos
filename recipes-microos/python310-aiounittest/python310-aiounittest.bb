SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python310-aiounittest-1.4.2-1.3.noarch.rpm"
RPM_HASH = "36d23f2efee7bbd11653914701521f1f42435df8bf03de2aca3de5ca04a1a08448725bf97773c571ac1f1358b6bb882b0843e2ab049024cc609deab19b338420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiounittest python3.10dist(aiounittest) python310-aiounittest python3dist(aiounittest)"
RDEPENDS:${PN} += "python(abi) python310-wrapt"

inherit rpm
