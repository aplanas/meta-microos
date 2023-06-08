SUMMARY = "a 9p mount helper"
DESCRIPTION = "This package contains the mount.9P script that clients can use \
to simplify mounting to NFS-Ganesha. This is a 9p mount helper."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-mount-9P-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "29f763a0efe731df6816207882077dd03dfcf0c34be7b3ef56ca712778fa3c709c9b443a5074cb2a0c4c437c472ce8397b37d5b8799fdc4bd15f6a0ef7dcc883"

RPROVIDES:${PN} += "nfs-ganesha-mount-9P nfs-ganesha-mount-9P(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
