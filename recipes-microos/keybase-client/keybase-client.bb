SUMMARY = "Keybase command line client"
DESCRIPTION = "The Keybase command line client allows to manage a keybase.io account from \
the command line. It includes functionality for encryption, signing, and \
signature verifcation. It can create proofs to link a PGP key to other \
accounts like Twitter, Github, or a Homepage. In addition, it allows to look \
up keys for such accounts that people have created a proof for."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "keybase-client-6.0.2-3.3.aarch64.rpm"
RPM_HASH = "e964dea09c64822755b6f62a9d1264a164e6464acc99a282fe5dba6c95b1ae16544ebce1a8aff90861d0be85f2fed95e43f154e78dba6008997a25f2c31a4b3b"

RPROVIDES:${PN} += "keybase-client keybase-client(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
