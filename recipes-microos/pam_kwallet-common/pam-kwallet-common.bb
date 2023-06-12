SUMMARY = "Support files for the KWallet PAM module"
DESCRIPTION = "This package contains support files used by the KWallet PAM \
module."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "pam_kwallet-common-5.27.5-1.1.noarch.rpm"
RPM_HASH = "a0a485fe2d9cf630c50c04e6999662b1544abbc28840c6efd3a23740b154cce09466363ef56c5cc5dc86bb31ba68434b15948280a9b2a6b4cd1bc5d5d389f26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(pam_kwallet-common) pam_kwallet-common"
RDEPENDS:${PN} += "/bin/sh kwalletd5 socat"

inherit rpm
