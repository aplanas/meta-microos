SUMMARY = "Should style asserts"
DESCRIPTION = "PyShould is a Python DSL allowing to write expectations or assertions \
in almost natural language. The goal is to offer an expressive yet \
readable syntax to define the expectations in detail. \
 \
Under the hood it uses the PyHamcrest library of matchers to build \
complex matching predicates and great explanations when there is a \
mismatch. \
 \
Its primary use case is in unit testing, replacing the need for \
Python's native assertX methods. Its use is completely transparent \
to the unit testing runner used, since mismatches are reported using \
the standard AssertionError."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-pyshould-0.7.1-6.12.noarch.rpm"
RPM_HASH = "f3be23547356a06dab5182975834e6b5aa0ecd47177336f742b99b1ceba8cda0524b1b306f61f55cfa6fce71f7f88d17e7736bcf7fc11961829326895bd41d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshould \
python3.10dist(pyshould) \
python310-pyshould \
python3dist(pyshould)"
RDEPENDS:${PN} += "python(abi) \
python310-hamcrest"

inherit rpm
