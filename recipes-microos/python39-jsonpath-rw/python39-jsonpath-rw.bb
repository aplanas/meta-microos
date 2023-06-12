SUMMARY = "An extended implementation of JSONPath for Python"
DESCRIPTION = "This library provides a robust and significantly extended implementation \
of JSONPath for Python. It is tested with Python 2.6, 2.7, 3.2, 3.3, and PyPy. \
 \
This library differs from other JSONPath implementations in that it is a \
full *language* implementation, meaning the JSONPath expressions are \
first class objects, easy to analyze, transform, parse, print, and \
extend. (You can also execute them :-)"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python39-jsonpath-rw-1.4.0-6.13.noarch.rpm"
RPM_HASH = "1ad30e218f01ed05ed8183ff5311598e1b4bc41cc90b917b967132f3d02005e3acf61e8c63ffc1e28e56cf773390235d94c50d1613c06c1b523cd9241aea9012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonpath-rw) \
python39-jsonpath-rw \
python3dist(jsonpath-rw)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-decorator \
python39-ply \
python39-six \
update-alternatives"

inherit rpm
