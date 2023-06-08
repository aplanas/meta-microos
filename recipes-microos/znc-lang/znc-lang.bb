SUMMARY = "Translations for package znc"
DESCRIPTION = "Provides translations for the 'znc' package."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-lang-1.8.2-3.6.noarch.rpm"
RPM_HASH = "691203ff5bd7cb09788c77e895b199769a29d69c13bdc300ce4f70eb6189d434ae74b08e4905b8ea4475bbe9f9d5242b6fc36951c4a11a319bfe003a85a96c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(znc:de_DE) locale(znc:el_GR) locale(znc:es_ES) locale(znc:fr_FR) locale(znc:it_IT) locale(znc:pl_PL) locale(znc:pt_BR) locale(znc:ru_RU) znc-lang znc-lang-all"
RDEPENDS:${PN} += "znc"

inherit rpm
