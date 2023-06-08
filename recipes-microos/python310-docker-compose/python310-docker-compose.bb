SUMMARY = "Tool to define and run complex applications using Docker"
DESCRIPTION = "Compose is a tool for defining and running complex applications with Docker. \
With Compose, you define a multi-container application in a single file, then \
spin your application up in a single command which does everything that needs \
to be done to get it running. \
 \
Compose is great for development environments, staging servers, and CI. We \
don't recommend that you use it in production yet. \
 \
Previously known as Fig."
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "python310-docker-compose-1.29.2-2.4.noarch.rpm"
RPM_HASH = "c1401af0e78fb3c6f12f504aeb8606534885cf2fe59b5613edbd653a3cf0450cba619ac71df64b6f7b084ad43e78054fc6aa865959b8a496309b4f00d4b43fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-compose python3-docker-compose python3.10dist(docker-compose) python310-docker-compose python3dist(docker-compose)"
RDEPENDS:${PN} += "(docker or podman >= 3.0) /bin/sh /usr/bin/python3.10 python(abi) python310-PySocks python310-PyYAML python310-cached-property python310-chardet python310-distro python310-docker python310-docker-pycreds python310-dockerpty python310-docopt python310-idna python310-jsonschema python310-python-dotenv python310-requests python310-texttable python310-websocket-client update-alternatives"

inherit rpm
