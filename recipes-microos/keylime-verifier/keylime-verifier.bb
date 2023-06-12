SUMMARY = "Keylime verifier service"
DESCRIPTION = "Subpackage of keylime for verifier service."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-verifier-7.0.0-2.1.noarch.rpm"
RPM_HASH = "f479c88d73416c8ea40d4dca28b2e35f706fd93cae5e873f0e259d1f1eef68021087395615ef17a36cd0b96de3e58a98f186591349c6d9f7387aa74cc781f84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-verifier"
RDEPENDS:${PN} += "/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm_cert_store \
python3-keylime"

inherit rpm
