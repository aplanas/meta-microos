SUMMARY = "Metadata for Monitoring plugins"
DESCRIPTION = "XML files containing metadata which facilitates using nagios \
plugins as resource agents. These files were produced from help \
pages of individual nagios plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.12.0+git30.7fd7c8fa"

RPM_NAME = "monitoring-plugins-metadata-4.12.0+git30.7fd7c8fa-1.1.noarch.rpm"
RPM_HASH = "e3944958eabd8b4e6d28634c62b02dc5be1be5373e1f8ea59390245a794609a0f42d00e910e1b926db43afbaf025676f9ced174a60af0d9c4ec273c4ad9249b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-metadata nagios-plugins-metadata"
RDEPENDS:${PN} += "monitoring-plugins-fping monitoring-plugins-http monitoring-plugins-ldap monitoring-plugins-mysql monitoring-plugins-pgsql monitoring-plugins-tcp resource-agents"

inherit rpm
