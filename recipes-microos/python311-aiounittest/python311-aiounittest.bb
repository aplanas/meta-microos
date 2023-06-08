SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python311-aiounittest-1.4.2-1.3.noarch.rpm"
RPM_HASH = "f4eb169ed7bc1b6462731d2bb4814f43c760fc317d1b9d8ddfb6894170c947bf195cbb73325b87ebb610e96d1a74c95529bd4b95ea910371d270db3926d8633d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiounittest) python311-aiounittest python3dist(aiounittest)"
RDEPENDS:${PN} += "python(abi) python311-wrapt"

inherit rpm
