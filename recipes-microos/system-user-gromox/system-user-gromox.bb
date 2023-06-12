SUMMARY = "System user and group gromox"
DESCRIPTION = "This package provides the gromox account."
LICENSE = "MIT"

PV = "2"

RPM_NAME = "system-user-gromox-2-1.2.noarch.rpm"
RPM_HASH = "f46211c29d0e9222768b961dcaec9bb708ad58906a2482a60b9cd800ad40b426a58914499b83cce8a722e635df8c752e54d8e595992ff6738a10248e88fff3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(gromox) \
system-user-gromox \
user(gromox)"
RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
