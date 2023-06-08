SUMMARY = "Files for HP local pseudo support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-local-plugin package contains the plugin for local pseudo \
storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-local-plugin-1.9.8-1.1.noarch.rpm"
RPM_HASH = "cf8c0a187e97dc73678f93a19e62f50bd96b5f00009ad8417b8eb59423eff65ab2ff3ab228e1bc7af2a70b8020c8bf9a04465d823d148d5c9c73b494295b7ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libstoragemgmt-local-plugin) libstoragemgmt-local-plugin"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-libstoragemgmt"

inherit rpm
