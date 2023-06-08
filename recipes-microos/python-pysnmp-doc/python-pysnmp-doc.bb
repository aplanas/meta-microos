SUMMARY = "PySNMP documentation"
DESCRIPTION = "PySNMP documentation and examples."
LICENSE = "BSD-2-Clause"

PV = "4.4.12"

RPM_NAME = "python-pysnmp-doc-4.4.12-2.13.noarch.rpm"
RPM_HASH = "ac88668e8f623191747ef68b4bca0511e467953c4d98ead5ca1fed7fa0b107b195370d988421871c0e9352dcb280aec0e2c86916d8efaf0556d186ce60e6af5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pysnmp-doc python310-pysnmp-doc python311-pysnmp-doc python39-pysnmp-doc"
RDEPENDS:${PN} += ""

inherit rpm
