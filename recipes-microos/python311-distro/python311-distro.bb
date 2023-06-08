SUMMARY = "Linux Distribution - a Linux OS platform information API"
DESCRIPTION = "distro (for: Linux Distribution) provides information about the Linux distribution it runs on, such as a reliable machine-readable ID, or version information. \
 \
It is a renewed alternative implementation for Python's original platform.linux_distribution function, but it also provides much more functionality which isn't necessarily Python bound like a command-line interface."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python311-distro-1.8.0-2.1.noarch.rpm"
RPM_HASH = "cfb6c9c297f48f6a95b7c881866078098ee9a8fb1c993ab0f2509ee6af95c3289bdc6db884ac70bf30cd4d2ddbfbfe41ec9a84d53d2ba13a2dc86f8d9a81c911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(distro) python311-distro python3dist(distro)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
