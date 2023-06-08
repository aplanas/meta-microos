SUMMARY = "Python Bindings Generator"
DESCRIPTION = "A tool to generate Python bindings for C/C++ code."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "python310-PyBindGen-0.22.1-1.3.noarch.rpm"
RPM_HASH = "b0799b466a903e5dc37286eb8858ccf7b7be81d1f2932f36b9003a878444bfe73a6658cd772fb976593f30395b3cf13335c42eaec82994139bf4d63cfecdddb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyBindGen python3.10dist(pybindgen) python310-PyBindGen python3dist(pybindgen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
