SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "python39-jaraco.context-4.1.1-1.4.noarch.rpm"
RPM_HASH = "805779a3138c6627604f888439a276f11617c63035f5df5468bfbcf09df68e7755d54c7ff356d19f781d9f2680fe260571934560168b51b8864ca7c06b7d2a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.context) python39-jaraco.context python3dist(jaraco.context)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
