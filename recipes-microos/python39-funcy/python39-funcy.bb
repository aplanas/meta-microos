SUMMARY = "Functional tools for Python"
DESCRIPTION = "A collection of functional tools focused on practicality. \
 \
Inspired by clojure, underscore and the author's own abstractions."
LICENSE = "BSD-3-Clause"

PV = "1.18"

RPM_NAME = "python39-funcy-1.18-1.2.noarch.rpm"
RPM_HASH = "f10f2774711b7e48f0de0fbd40facd93f5663ba6bd4dd07e7f6ff875f664288876994f708e130607262f2af3b16497cfaad36be9e7223d8d314252d88d69d5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(funcy) python39-funcy python3dist(funcy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
