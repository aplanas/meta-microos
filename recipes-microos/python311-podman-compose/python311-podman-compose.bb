SUMMARY = "A script to run docker-compose using podman"
DESCRIPTION = "An implementation of `docker-compose` with podman backend. \
The main objective of this project is to be able to run `docker-compose.yml` \
unmodified and rootless.  This project is aimed to provide drop-in replacement \
for `docker-compose`, and it's very useful for certain cases because: \
 \
- can run rootless \
- only depend on `podman` and Python3 and PyYAML \
- no daemon, no setup \
- can be used by developers to run single-machine containerized stacks using \
  single familiar YAML file"
LICENSE = "GPL-2.0-only"

PV = "1.0.6"

RPM_NAME = "python311-podman-compose-1.0.6-2.1.noarch.rpm"
RPM_HASH = "da323a4b9619c09cfac297928d7a1ae85dea2cc760818727f19190ba653a009d0358f106d21e57f0dd67feed1a6ccb54583d89965826217155b897d98d8f86a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-compose python3.11dist(podman-compose) python311-podman-compose python3dist(podman-compose)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 podman python(abi) python311-PyYAML python311-python-dotenv python311-setuptools update-alternatives"

inherit rpm
