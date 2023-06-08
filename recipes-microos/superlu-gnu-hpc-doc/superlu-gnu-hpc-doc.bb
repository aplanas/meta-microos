SUMMARY = "Dependency package for superlu_6_0_0-gnu-hpc-doc"
DESCRIPTION = "superlu: A general purpose library for the direct solution of linear equations \
The package superlu-gnu-hpc-doc provides the dependency to get binary package superlu_6_0_0-gnu-hpc-doc. \
When this package gets updated it installs the latest version of superlu_6_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu-gnu-hpc-doc-6.0.0-2.1.noarch.rpm"
RPM_HASH = "a025cdffe3e5dfe6372c81ad1161c3020025b429aa0890628ea2cc8be21088ce7bfb8d99bfbc7dfbfd87f71ec262ff9ac7e2a9e609fef590ed69808140bf2bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-gnu-hpc-doc"
RDEPENDS:${PN} += "superlu_6_0_0-gnu-hpc-doc"

inherit rpm
