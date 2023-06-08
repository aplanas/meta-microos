SUMMARY = "Python packages that adds features to Click"
DESCRIPTION = "Adds features to Click: option groups, constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.0.0.post1"

RPM_NAME = "python311-cloup-2.0.0.post1-1.3.noarch.rpm"
RPM_HASH = "ff95377caf2e97c8f9ec7b90e145680a726cead41fd9d7188dea7d2d19d3e7ade33a5a94dae6e4f52f574d6d4585da1e2f9adecc3a32eb9b4c10771c5dc6a71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cloup) python311-cloup python3dist(cloup)"
RDEPENDS:${PN} += "python(abi) python311-click"

inherit rpm
