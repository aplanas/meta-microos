SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/11"
DESCRIPTION = "This is a little HTTP/1.1 library written from scratch in Python, \
heavily inspired by hyper-h2 <https://hyper-h2.readthedocs.io>"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-h11-0.14.0-2.1.noarch.rpm"
RPM_HASH = "b3aae4b45c67545ea5dddc15f649548517a8d7b839de5d9aada2ebfcef09677d3b7bf1885d1836962eaa8aeeb41e9b03a175942c09f7f9c9fa5e4265bd13e36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h11 python3.10dist(h11) python310-h11 python3dist(h11)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
