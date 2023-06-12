SUMMARY = "System user vscan"
DESCRIPTION = "This package provides the system user 'vscan'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-vscan-20170617-24.14.noarch.rpm"
RPM_HASH = "743219170c46a86371709b1a243bd7eb453767d155f96e3e9d4a85f17b27e0cf3da1e17b928bcf0f8d575c7b9bce6a010f76033cd08eec3bbc62c323765d7e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(vscan) \
system-user-vscan \
user(vscan)"
RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
