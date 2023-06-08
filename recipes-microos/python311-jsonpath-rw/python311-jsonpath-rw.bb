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

RPM_NAME = "python311-jsonpath-rw-1.4.0-6.13.noarch.rpm"
RPM_HASH = "6673807db01615171fcd1cef2cfb08ca63589daf654b3a71ee342b8c67659194f1eb63f11af3e2e49dda52683766503d6f9e0fae56fd580b78d67382c54e8785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonpath-rw) python311-jsonpath-rw python3dist(jsonpath-rw)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-decorator python311-ply python311-six update-alternatives"

inherit rpm
