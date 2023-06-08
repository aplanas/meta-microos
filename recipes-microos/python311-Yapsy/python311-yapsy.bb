SUMMARY = "Yet another plugin system"
DESCRIPTION = "Yapsy is a small library implementing the core mechanisms needed to \
build a plugin system into a wider application. \
 \
The main purpose is to depend only on Python's standard libraries (at \
least version 2.3) and to implement only the basic functionalities \
needed to detect, load and keep track of several plugins."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "python311-Yapsy-1.12.2-3.8.noarch.rpm"
RPM_HASH = "b0306804cba466d81735e040b180c3cdfa1d6ae6ef3640e3789d01e55e7cca94f3073a5c29e15d480af3193ef64439b3b4983993af741dcc0b51e0a460ae9169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yapsy) python311-Yapsy python311-yapsy python3dist(yapsy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
