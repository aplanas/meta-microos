SUMMARY = "Test plugin for health-checker"
DESCRIPTION = "This package contains a script for testing the CaaSP health checker. \
It will report success or failures depending on previous states."
LICENSE = "GPL-2.0-only"

PV = "1.7"

RPM_NAME = "health-checker-testing-1.7-1.2.noarch.rpm"
RPM_HASH = "d1b04c48669e0d9c5eda9ee50dcca988a14876cfce85be1e68206a302a1dddcaa90b592061f02d160de9012f8938ca3780c6cc9e098a4129bbf9ce7c171092c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins health-checker-testing"
RDEPENDS:${PN} += "/bin/bash health-checker"

inherit rpm
