SUMMARY = "A command shell for managing the Linux LIO kernel target"
DESCRIPTION = "targetcli-fb is a command-line interface for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. \
 \
targetcli-fb is a fork of the 'targetcli' code written by RisingTide Systems. \
The '-fb' differentiates between the original and this version. Please ensure \
to use either all 'fb' versions of the targetcli components -- targetcli, \
rtslib, and configshell, or stick with all non-fb versions, since they are \
no longer strictly compatible."
LICENSE = "Apache-2.0"

PV = "2.1.54"

RPM_NAME = "python311-targetcli-fb-2.1.54-2.1.noarch.rpm"
RPM_HASH = "4dc190b8a60a61c027fe2b2751e30133d6cdd66a68d0ca1f30b2a6b10d14d330ac7e1d755b3f91f250ab2d431961507fec64ba8edcf8f8353b8ea67d51cd88d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(targetcli-fb) python311-targetcli-fb python3dist(targetcli-fb)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-configshell-fb python311-dbus-python python311-rtslib-fb python311-six targetcli-fb-common update-alternatives"

inherit rpm
