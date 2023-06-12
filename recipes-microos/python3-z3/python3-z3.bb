SUMMARY = "Python bindings for Z3"
DESCRIPTION = "Python bindings for the Z3 library."
LICENSE = "MIT"

PV = "4.12.1"

RPM_NAME = "python3-z3-4.12.1-1.3.noarch.rpm"
RPM_HASH = "c360959c211bc4f87c7b14832c6fe4070f1d285dc2acc85b02331dfb8654f96af4d32583c6d250b82662f3f3059ad1b50d3a37e2e523ede9cc1b71fb7f708296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-z3"
RDEPENDS:${PN} += "libz3-4_12 \
python(abi)"

inherit rpm
