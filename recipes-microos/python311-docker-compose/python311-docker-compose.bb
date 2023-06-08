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

RPM_NAME = "python311-docker-compose-1.29.2-2.4.noarch.rpm"
RPM_HASH = "a98e537c801718015ae723185b2c612d34a9603cbfd3dee2ac7c8ae1df08c056c008c0beb8aa1b59ac1ed982a9e1951159c8ec9c16f5a9a83ac34d7a2aec4471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-compose python3.11dist(docker-compose) python311-docker-compose python3dist(docker-compose)"
RDEPENDS:${PN} += "(docker or podman >= 3.0) /bin/sh /usr/bin/python3.11 python(abi) python311-PySocks python311-PyYAML python311-cached-property python311-chardet python311-distro python311-docker python311-docker-pycreds python311-dockerpty python311-docopt python311-idna python311-jsonschema python311-python-dotenv python311-requests python311-texttable python311-websocket-client update-alternatives"

inherit rpm
