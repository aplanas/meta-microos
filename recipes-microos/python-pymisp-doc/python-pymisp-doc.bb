SUMMARY = "Examples and Documentation for python-pymisp"
DESCRIPTION = "Examples and HTML documentation for python-pymisp."
LICENSE = "BSD-2-Clause"

PV = "2.4.166"

RPM_NAME = "python-pymisp-doc-2.4.166-1.4.noarch.rpm"
RPM_HASH = "e6a9633c0ff3afe588150be5def43fc3e1996b5d25867d92391baa8acf9a4986a941a730ba17e8f8a995ec90b328fa30936ff381bf22a13129bde034c8ff2553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pymisp-doc"
RDEPENDS:${PN} += ""

inherit rpm
