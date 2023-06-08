SUMMARY = "A pass extension for managing one-time-password (OTP) tokens"
DESCRIPTION = "A pass extension for managing one-time-password (OTP) tokens. \
More information may be found in the pass-otp(1) man page."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "pass-otp-1.2.0-2.8.noarch.rpm"
RPM_HASH = "cebd3f4b0969be4a83118a29c3410c27846c181840ddff16bae91d4bded7845e94db153e691ba7443f66cb54ebf9837197b21699d605a69e7ccbeb65d35f8bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pass-otp"
RDEPENDS:${PN} += "/bin/bash oath-toolkit password-store qrencode"

inherit rpm
