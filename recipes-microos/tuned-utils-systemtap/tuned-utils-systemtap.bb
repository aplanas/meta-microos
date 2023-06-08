SUMMARY = "Disk and net statistic monitoring systemtap scripts"
DESCRIPTION = "This package contains several systemtap scripts to allow detailed \
manual monitoring of the system. Instead of the typical IO/sec it collects \
minimal, maximal and average time between operations to be able to \
identify applications that behave power inefficient (many small operations \
instead of fewer large ones)."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-utils-systemtap-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "af2b8d1f9f776f31abc3ecc41d02e2d1886877e21c1f8aa452f66b501226f59b4e318eb0a143fb4436b5f2cdf354817b16b5ac4432c909eac6dbf092bccd1ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-utils-systemtap"
RDEPENDS:${PN} += "/usr/bin/python3 /usr/bin/stap systemtap tuned"

inherit rpm
