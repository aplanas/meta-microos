SUMMARY = "A wrapper for the GNU Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "This module allows access to GnuPG's key management, \
encryption and signature functionality from Python programs."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-python-gnupg-0.5.0-2.1.noarch.rpm"
RPM_HASH = "81cb52c69031994562625c5e3025ed402f7d3f018c548845dc7e9f06fd604d35d415686b9fd0aa7a47e569202a1df3420821a2bd638308d214ebcc7e73d07093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-gnupg) python311-gnupg python311-python-gnupg python3dist(python-gnupg)"
RDEPENDS:${PN} += "gpg2 python(abi)"

inherit rpm
