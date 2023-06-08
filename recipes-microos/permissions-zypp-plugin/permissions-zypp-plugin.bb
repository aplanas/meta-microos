SUMMARY = "A zypper commit plugin for calling chkstat"
DESCRIPTION = "This package contains a plugin for zypper that calls `chkstat --system` after \
new packages have been installed. This is helpful for maintaining custom \
entries in /etc/permissions.local."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230424"

RPM_NAME = "permissions-zypp-plugin-1699_20230424-1.1.noarch.rpm"
RPM_HASH = "76716ff0331f10e10e9ba2d7882d63a3299ed8ccbef8b8b0f03f0fe70081eef7acd0760257b168c9e7c4f8e221dc3feb57cb41508f78724ea17868a0152a0a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "permissions-zypp-plugin"
RDEPENDS:${PN} += "/usr/bin/python3 libzypp(plugin:commit) permissions python3-zypp-plugin"

inherit rpm
