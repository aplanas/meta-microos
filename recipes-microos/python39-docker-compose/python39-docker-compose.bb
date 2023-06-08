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

RPM_NAME = "python39-docker-compose-1.29.2-2.4.noarch.rpm"
RPM_HASH = "83a6cdd65f58d206529ee018d347934453462ce65840b94572b2a542d9d693ca0645882ee4887d90d0fb46bcd927e9b23e5d2ca10cca50df2c0420fc806262e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-compose python3.9dist(docker-compose) python39-docker-compose python3dist(docker-compose)"
RDEPENDS:${PN} += "(docker or podman >= 3.0) /bin/sh /usr/bin/python3.9 python(abi) python39-PySocks python39-PyYAML python39-cached-property python39-chardet python39-distro python39-docker python39-docker-pycreds python39-dockerpty python39-docopt python39-idna python39-jsonschema python39-python-dotenv python39-requests python39-texttable python39-websocket-client update-alternatives"

inherit rpm
