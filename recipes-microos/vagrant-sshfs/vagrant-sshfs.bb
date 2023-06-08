SUMMARY = "SSHFS synced folder implementation for Vagrant"
DESCRIPTION = "This Vagrant plugin adds synced folder support for mounting folders from the \
Vagrant host into the Vagrant guest via SSHFS. In the default mode it does this \
by executing the SSHFS client software within the guest, which creates an SSH \
connection from the Vagrant guest back to the Vagrant host."
LICENSE = "GPL-2.0-only"

PV = "1.3.7"

RPM_NAME = "vagrant-sshfs-1.3.7-3.4.aarch64.rpm"
RPM_HASH = "e46ebf6c5ac0daf803a6f18e9fde117b3d319e1857bfb7748ff876520f525e9318259a2406b28294c0009d3466b5edd0b39332e15b34839bc95cdc23dffd85d4"

RPROVIDES:${PN} += "vagrant-sshfs vagrant-sshfs(aarch-64)"
RDEPENDS:${PN} += "/bin/bash fuse sshfs vagrant"

inherit rpm
