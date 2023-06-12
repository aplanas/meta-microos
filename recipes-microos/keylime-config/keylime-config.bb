SUMMARY = "Configuration file for keylime"
DESCRIPTION = "Subpackage of keylime for the shared configuration files for the agent \
and the server components."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-config-7.0.0-2.1.noarch.rpm"
RPM_HASH = "01b289ed80ed561ca52143ff62c4ce46716fe4348ffa15fc924b0f005bb695309b0d62929536705f1af343d4336cf287e77c8d3b6a0bba456739d05aea9fe3f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-config"
RDEPENDS:${PN} += "python3-keylime"

inherit rpm
