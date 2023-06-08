SUMMARY = "Scripts and data for building API documentation"
DESCRIPTION = "The kapidox framework enables the generation of API documentation from \
Doxygen-formatted codde comments in a standard format and style."
LICENSE = "BSD-2-Clause"

PV = "5.105.0"

RPM_NAME = "kapidox-5.105.0-1.1.noarch.rpm"
RPM_HASH = "4931f30f2ca940b9b78a5dd2dd9a5f60c3e1682d05ec7f00ce8d4123aaab128018ee7ad004da7eb5e7ff9b29b86528750167f5f77b4b7be41b5723b4d5f77d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapidox python3.10dist(kapidox) python3dist(kapidox)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 doxygen graphviz graphviz-gd libqt5-qttools python(abi) python3-Jinja2 python3-xml"

inherit rpm
