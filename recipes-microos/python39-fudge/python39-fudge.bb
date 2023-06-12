SUMMARY = "Module for replacing real objects with fakes (mocks, stubs, etc) while testing"
DESCRIPTION = "Fudge is a Python module for using fake objects (mocks and stubs) to test real ones. \
 \
In readable Python code, you declare what methods are available on your fake and \
how they should be called. Then you inject that into your application and start \
testing. This declarative approach means you don't have to record and playback \
actions and you don't have to inspect your fakes after running code. If the fake \
object was used incorrectly then you'll see an informative exception message \
with a traceback that points to the culprit."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-fudge-1.1.1-6.7.noarch.rpm"
RPM_HASH = "f06881734fa1bd994811efc78cb4aa5b783851b18ba0e25e4ed8cffdc03610d736f264c3a8dcb016408f7d18e2dc165f6bccf591978bb74cdd214d36622f71bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fudge) \
python39-fudge \
python3dist(fudge)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
