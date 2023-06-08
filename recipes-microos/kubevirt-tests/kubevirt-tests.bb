SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-tests-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "fc0ff3dd54c6259da09a0088bfe3b952687d1a32660a2a5da2e010a4e480fe87fca8e0ec525b5564564dac03c150ca24b29421f45d833f9a6082843072716762"

RPROVIDES:${PN} += "kubevirt-tests kubevirt-tests(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
