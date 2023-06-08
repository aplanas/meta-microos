SUMMARY = "Dependency package for libpapi_7_0_0-hpc"
DESCRIPTION = "papi: Performance Application Programming Interface \
The package libpapi-hpc provides the dependency to get binary package libpapi_7_0_0-hpc. \
When this package gets updated it installs the latest version of papi_7_0_0-hpc."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "libpapi-hpc-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "77d75ff4c85f3cb44751f74e61d32e723cfd5dab1e706512f63d4b341f50d36f44f367e46eaa5c2038837a8f53ae96609e82656ab3123a79983a92a7651bc1bd"

RPROVIDES:${PN} += "libpapi-hpc libpapi-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libpapi_7_0_0-hpc"

inherit rpm
