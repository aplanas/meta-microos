SUMMARY = "YAML processor for JRuby"
DESCRIPTION = "YAML processor extracted from JRuby."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "jvyamlb-0.2.5-20.6.noarch.rpm"
RPM_HASH = "1316cf6cd9a040c81316e9e0cbe622d0bd7cb724fbe77a7d568ff9fc6ad3f883dbc21dc13ba319c7bf751217a966fa80e75f8a3e2885080a239ab5e6b7a9ebb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jvyamlb"
RDEPENDS:${PN} += "bytelist java javapackages-tools jcodings joda-time"

inherit rpm
