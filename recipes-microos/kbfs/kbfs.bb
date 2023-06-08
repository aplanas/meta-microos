SUMMARY = "Encrypted remote storage based on Keybase identities"
DESCRIPTION = "The Keybase filesystem provides encrypted remote storage. Encryption is \
handled transparently based on Keybase accounts. \
 \
In addition to plain file storage this also provides a possibility to \
host public files and store Git repositories."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-6.0.2-3.3.aarch64.rpm"
RPM_HASH = "a2cb859ba3237a51c77f402da533755e674d27f5a8c0b4dce92a76a6b94c69e3d68e537d018e2fd952466116a98bfd62c48f9ec744f6517a5d91568fe2cc5856"

RPROVIDES:${PN} += "kbfs kbfs(aarch-64)"
RDEPENDS:${PN} += "/bin/sh keybase-client"

inherit rpm
