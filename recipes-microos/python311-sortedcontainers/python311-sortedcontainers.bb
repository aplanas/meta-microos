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

RPM_NAME = "python311-sortedcontainers-2.4.0-2.1.noarch.rpm"
RPM_HASH = "0282416f9ddb2c661e3f8123f55f0ade176dfa5da4aedda5c24e2216e6adc51dd328eafc580cf31088e190f3b9390d5289ea78495ad282eca1f2eedd953862fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sortedcontainers) python311-sortedcontainers python3dist(sortedcontainers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
