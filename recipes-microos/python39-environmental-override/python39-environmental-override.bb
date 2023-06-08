SUMMARY = "Module to configure apps using environment variables"
DESCRIPTION = "Environmental Override offers setting configuration values from \
environment variables."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-environmental-override-0.1.2-1.17.noarch.rpm"
RPM_HASH = "0549cbe01458eb63ba18d17dac4eaced8bce4033ea8aedeecbcfb1131526e66e7619e209ee3d44b92d34f92326ba4f5741c66ba16f9feaf385ef4ae273d34ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(environmental-override) python39-environmental-override python3dist(environmental-override)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
