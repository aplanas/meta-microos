SUMMARY = "System user and group 'mktex'"
DESCRIPTION = "This package provides a shared system user for TeXLive"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "system-user-mktex-1.0.0-2.6.noarch.rpm"
RPM_HASH = "d27a19dc3f89d31462f294678fa6d769d342e01f44d5458e5b02b04542041482c9962e48021d579a9c82f81cdbfea6e840392b767fcc4522e45c1b82657c54fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(mktex) system-user-mktex user(mktex)"
RDEPENDS:${PN} += "/bin/sh sysuser-shadow"

inherit rpm
