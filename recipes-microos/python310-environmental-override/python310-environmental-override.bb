SUMMARY = "Module to configure apps using environment variables"
DESCRIPTION = "Environmental Override offers setting configuration values from \
environment variables."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-environmental-override-0.1.2-1.17.noarch.rpm"
RPM_HASH = "1c8482af67e58929b30d47c176eaa0bf6635e4d83fc3505aefe337d1ae47b63f98972321ab85e30fa285c8b075581f724ce7a85a6fd4543e5fa15dca4865f348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-environmental-override python3.10dist(environmental-override) python310-environmental-override python3dist(environmental-override)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
