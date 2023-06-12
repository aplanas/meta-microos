SUMMARY = "Sorted container data types"
DESCRIPTION = "SortedContainers is an Apache2 licensed containers library, written in \
pure-Python, and fast as C-extensions. \
 \
Python's standard library is great until you need a sorted container type. Many \
will attest that you can get really far without one, but the moment you **really \
need** a sorted list, dict, or set, you're faced with a dozen different \
implementations, most using C-extensions without great documentation and \
benchmarking. \
 \
SortedContainers takes all of the work out of Python sorted types - making your \
deployment and use of Python easy. There's no need to install a C compiler or \
pre-build and distribute custom extensions. Performance is a feature and testing \
has 100% coverage with unit tests and hours of stress."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python39-sortedcontainers-2.4.0-2.1.noarch.rpm"
RPM_HASH = "99c39153fabd4ead4d2bb260cd1ac04100a7dba296a8cbd350a57caed37e6c19a301b83387cae3259f2df20321b179f9c8066a060d291e4ebcf7a897dd6c5457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sortedcontainers) \
python39-sortedcontainers \
python3dist(sortedcontainers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
