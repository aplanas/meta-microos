SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python311-aiounittest-1.4.2-2.1.noarch.rpm"
RPM_HASH = "184ec397573089944db953dcdd8ceb3d22b8506063bb1cc19a4b69e7d49368be6886f9a24281129ef0fa144083261bd35c69bc802b44d85b35e476d103e0a176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiounittest) python311-aiounittest python3dist(aiounittest)"
RDEPENDS:${PN} += "python(abi) python311-wrapt"

inherit rpm
