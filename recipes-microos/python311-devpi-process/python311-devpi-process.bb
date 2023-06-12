SUMMARY = "Programmatic API to create and use a devpi server process"
DESCRIPTION = "This package provides a programmatic API to create and use a \
devpi server process."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-devpi-process-0.3.0-1.1.noarch.rpm"
RPM_HASH = "4ed44c2b65adc74ebec43460d4fb9ca43d160ed1a12ed529daf3c694335805749bd4c4b6d2927a9ccbf63b9eb3e082891189cb0782e9a50d5816aa2e264f7362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(devpi-process) python311-devpi-process python3dist(devpi-process)"
RDEPENDS:${PN} += "python(abi) python311-devpi-client python311-devpi-server"

inherit rpm
