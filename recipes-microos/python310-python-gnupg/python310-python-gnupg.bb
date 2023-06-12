SUMMARY = "A wrapper for the GNU Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "This module allows access to GnuPG's key management, \
encryption and signature functionality from Python programs."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-python-gnupg-0.5.0-2.1.noarch.rpm"
RPM_HASH = "1d09856751d1c0f2e013a7b9bcdb4d69b8c1bd1dcf46a9eff91ea7970f61926f4448fcd7db24b2d0cdfe99e52cfe7510718ac3be358683e99325c639fb35db48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gnupg \
python3-python-gnupg \
python3.10dist(python-gnupg) \
python310-gnupg \
python310-python-gnupg \
python3dist(python-gnupg)"
RDEPENDS:${PN} += "gpg2 \
python(abi)"

inherit rpm
