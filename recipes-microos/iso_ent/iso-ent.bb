SUMMARY = "Character Entity Sets for ISO 8879:1986"
DESCRIPTION = "Character entity sets for ISO 8879:1986."
LICENSE = "SUSE-Permissive"

PV = "2000.11.03"

RPM_NAME = "iso_ent-2000.11.03-828.17.noarch.rpm"
RPM_HASH = "5d1d22b477c1f76bc2f66aeb9527f8ba3939de8db178b9bc426fb3e609fe85122b41cfdfa57ac9418aaf77541f7f246b1d4647d30eca413d39146a2a96e031c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(iso_ent) iso-ent iso-entities iso_ent"
RDEPENDS:${PN} += "/bin/sh /usr/bin/sgml-register-catalog"

inherit rpm
