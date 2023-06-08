SUMMARY = "Keylime tenant command line tool"
DESCRIPTION = "Subpackage of keylime for tenant command line tool."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-tenant-7.0.0-1.1.noarch.rpm"
RPM_HASH = "38e79674054d23e4bb7dab76e89287210e3f735421edcd077995fb592693718e415ed757c8fb0c6dec328b36aa4c3e26a9379d4d8b03654d9574f505b6fe4cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-tenant"
RDEPENDS:${PN} += "keylime-config keylime-tpm_cert_store python3-keylime"

inherit rpm
