SUMMARY = "WSL systemd setup"
DESCRIPTION = "This package contains the wsl_systemd pattern: adjusts or provides /etc/wsl.conf and /sbin/init symlink where required."
LICENSE = "MIT"

PV = "20221221"

RPM_NAME = "patterns-wsl-systemd-20221221-1.2.noarch.rpm"
RPM_HASH = "e1580c6852fca7f1332dbf411f7b582dedc0c7a5b66b19f4edefd26e29d657ca8887ac93da91fbe1e4cdaa8dcb9be4ad4abbca32b5452c7aef22128f49aa66c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-visible() \
patterns-wsl-systemd"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
systemd"

inherit rpm
