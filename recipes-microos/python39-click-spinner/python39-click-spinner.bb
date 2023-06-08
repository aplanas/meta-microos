SUMMARY = "Spinner for Click"
DESCRIPTION = "Spinner for Click."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python39-click-spinner-0.1.10-2.3.noarch.rpm"
RPM_HASH = "622f4949ae9f290c31c66eaa854706f6557b3c56901f1aff1301148914bddb115ca63fc38ed1ae2446f9fb88a9db486bafe6c1811af5dcad1fa4b624d3a0adb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-spinner) python39-click-spinner python3dist(click-spinner)"
RDEPENDS:${PN} += "python(abi) python39-click"

inherit rpm
