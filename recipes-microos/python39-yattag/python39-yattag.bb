SUMMARY = "Generate HTML or XML in a pythonic way"
DESCRIPTION = "Generate HTML or XML in a pythonic way. \
Pure python alternative to web template engines. \
Can fill HTML forms with default values and error messages."
LICENSE = "LGPL-2.1-only"

PV = "1.15.1"

RPM_NAME = "python39-yattag-1.15.1-1.1.noarch.rpm"
RPM_HASH = "5e9fa25d67062df1df5944d839633195760b720831e5f9b320d6f58b44b63abe1d9ad7ee849b68675c06d3a93e6f25b93becff5b08ae18b39b36b668f3d7108e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yattag) python39-yattag python3dist(yattag)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
