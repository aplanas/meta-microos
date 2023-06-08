SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "python311-devpi-server-6.8.0-2.1.noarch.rpm"
RPM_HASH = "c2fe5c836ac4efab0341243a9a3c116bc3750a2c10d788d6a703e6a507f664753b261c553853162a89277e766ecf3d186288cf95b41b630ed665a7b795f709ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(devpi-server) python311-devpi-server python3dist(devpi-server)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-aiohttp python311-appdirs python311-argon2-cffi python311-attrs python311-defusedxml python311-devpi-common python311-execnet python311-itsdangerous python311-lazy python311-passlib python311-platformdirs python311-pluggy python311-py python311-pyramid python311-repoze.lru python311-ruamel.yaml python311-strictyaml python311-waitress update-alternatives"

inherit rpm
