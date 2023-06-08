SUMMARY = "Support files for the KWallet PAM module"
DESCRIPTION = "This package contains support files used by the KWallet PAM \
module."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "pam_kwallet-common-5.27.4-1.1.noarch.rpm"
RPM_HASH = "88d279084cebe56e42ffb7d5c2b7ceef00867a8afb94a5695a9da26f85c922077fcd82b72d7114bc8e0f78732dc12db7a3daa18bee101e634a78c16cd24e9765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(pam_kwallet-common) pam_kwallet-common"
RDEPENDS:${PN} += "/bin/sh kwalletd5 socat"

inherit rpm
