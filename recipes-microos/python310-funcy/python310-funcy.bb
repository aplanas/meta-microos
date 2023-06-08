SUMMARY = "Functional tools for Python"
DESCRIPTION = "A collection of functional tools focused on practicality. \
 \
Inspired by clojure, underscore and the author's own abstractions."
LICENSE = "BSD-3-Clause"

PV = "1.18"

RPM_NAME = "python310-funcy-1.18-1.2.noarch.rpm"
RPM_HASH = "4775e5ea01d8bc0fb0d750ab91ba25af9a8e60cf3c1c0a4f2947941dfdf05cfd27c28f0bfde4200d5420554cfa5efa4acb960496455b250cd27baa848b179c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-funcy python3.10dist(funcy) python310-funcy python3dist(funcy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
