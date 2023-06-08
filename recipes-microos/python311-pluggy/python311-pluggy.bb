SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pluggy-1.0.0-2.1.noarch.rpm"
RPM_HASH = "c6b0a9888a228a9a337748720e553d50302334351717d04be160a3b4cbc8c6ba74ad8c56192cf35df1e713f1bdda72ca98c9601472172bc80384a0e3b8266c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pluggy) python311-pluggy python3dist(pluggy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
