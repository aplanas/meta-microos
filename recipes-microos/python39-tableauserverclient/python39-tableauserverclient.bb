SUMMARY = "Python library for working with the Tableau Server REST API"
DESCRIPTION = "A Python module for working with the Tableau Server REST API."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python39-tableauserverclient-0.18.0-1.7.noarch.rpm"
RPM_HASH = "4fa418944bc71ac95e6f9ea7eaeb170d9ba83d21812961189c5c4e255d481c57a02a16f7825f0d0de0cbeb2d39f1ea622537cbb2473437f79948f5f06b9ef71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tableauserverclient) python39-tableauserverclient python3dist(tableauserverclient)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
