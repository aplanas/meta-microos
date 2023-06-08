SUMMARY = "Python module for ANSI color output and colored highlighting and diffing"
DESCRIPTION = "Ansicolor is a library that offers ANSI color markup for \
command line programs."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "python39-ansicolor-0.3.2-1.6.noarch.rpm"
RPM_HASH = "e88fcde5b63c589b4fce25008aca730cd33c90b04db99c266dfe07fbd67ddd35c84a3bc506553ca3000990f719ee32ee2760309a819a458b5a88cb8eaa903c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ansicolor) python39-ansicolor python3dist(ansicolor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
