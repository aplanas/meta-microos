SUMMARY = "SUSE Linux Default Permissions config files"
DESCRIPTION = "The actual permissions configuration files, /usr/share/permissions/permission.*."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230424"

RPM_NAME = "permissions-config-1699_20230424-1.1.noarch.rpm"
RPM_HASH = "1470fb1af8e6f813303a14a088a76d3efdf3fd06595d2e659dce17a6b4bf895ea0550ed3bfe35a0f0852bc5dddb634b5b1cb4dea74c35615fc7990ca0d5ed79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(permissions-config) permissions-config"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch chkstat fillup group(trusted)"

inherit rpm
