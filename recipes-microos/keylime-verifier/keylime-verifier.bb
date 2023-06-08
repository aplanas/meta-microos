SUMMARY = "Keylime verifier service"
DESCRIPTION = "Subpackage of keylime for verifier service."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-verifier-7.0.0-1.1.noarch.rpm"
RPM_HASH = "c45dcbf1d845385f686b25f1540329fcb63566f8cc56b00a5799cfc3f42f31e13c63c4e61e651beea1a3ea6eef0da7fcb2fecbe047145d4f243524ee1b303d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-verifier"
RDEPENDS:${PN} += "/bin/sh keylime-config keylime-logrotate keylime-tpm_cert_store python3-keylime"

inherit rpm
