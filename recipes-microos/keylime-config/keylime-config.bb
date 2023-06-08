SUMMARY = "Configuration file for keylime"
DESCRIPTION = "Subpackage of keylime for the shared configuration files for the agent \
and the server components."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-config-7.0.0-1.1.noarch.rpm"
RPM_HASH = "63f8cbaa2ff1573940b0dd0a62c54e0c1569cbb1c1fc04deafb9b669cc5b7dc476c34fd5d31bfb0bcc5f769e466e2597ac1871ba5f942e46f21431eea4fabef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-config"
RDEPENDS:${PN} += "python3-keylime"

inherit rpm
