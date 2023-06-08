SUMMARY = "Python in-process context propogation"
DESCRIPTION = "The OpenCensus Runtime Context provides in-process context propagation. \
By default, thread local storage is used for Python 2.7, 3.4 and 3.5; \
contextvars is used for Python >= 3.6, which provides asyncio support."
LICENSE = "Apache-2.0"

PV = "0.1.3"

RPM_NAME = "python311-opencensus-context-0.1.3-1.3.noarch.rpm"
RPM_HASH = "852e0e335f0632eacbb9cf5cab9bf025a0ea9df64de0ed94a03c4af05b3350974507035894cef35b0b5f52cd0c0bc52fd2279878595d319c19b34d3649e02873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(opencensus-context) python311-opencensus-context python3dist(opencensus-context)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
