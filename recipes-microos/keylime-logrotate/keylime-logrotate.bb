SUMMARY = "Logrotate for Keylime servies"
DESCRIPTION = "Subpackage of keylime for logrotate for Keylime services"
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-logrotate-7.0.0-1.1.noarch.rpm"
RPM_HASH = "e6936a3309f56eb36317ab8cd8d1c9fad51978ff887d4d10634bcf52fd71be10964925fc4d7e43c45418bf2c13fcb1a74a71ad67d50fe4ee36d5df85576c7faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-logrotate"
RDEPENDS:${PN} += "logrotate"

inherit rpm
