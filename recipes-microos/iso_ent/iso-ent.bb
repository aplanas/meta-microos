SUMMARY = "Character Entity Sets for ISO 8879:1986"
DESCRIPTION = "Character entity sets for ISO 8879:1986."
LICENSE = "SUSE-Permissive"

PV = "2000.11.03"

RPM_NAME = "iso_ent-2000.11.03-829.1.noarch.rpm"
RPM_HASH = "931005ef3283eb9aa8e61460252d5d2778350dfed0a647ba61a0a0a7af2ebb9b1f44e469212136680500465f78b732203d31a35a7d8674836598f31261f26e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(iso_ent) iso-ent iso-entities iso_ent"
RDEPENDS:${PN} += "/bin/sh /usr/bin/sgml-register-catalog"

inherit rpm
