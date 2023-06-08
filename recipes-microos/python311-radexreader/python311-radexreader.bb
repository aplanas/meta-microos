SUMMARY = "Reader for the RADEX RD1212 and ONE Geiger counters"
DESCRIPTION = "The RadexReader is an user-space driver for the RADEX RD1212 and \
the RADEX ONE Geiger counters. It allow to read and clear stored \
data via USB. \
 \
To avoid Access denied (insufficient permissions), don't forget \
to unplug the device after installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "python311-radexreader-1.2.1-1.9.noarch.rpm"
RPM_HASH = "ac21be4365e2a7c89a63ff4fe9885a7bac74f33332059388451f6483ca59882a8421a6e895775fb9189f44ee119ab25b9a7be2540faaada01b82050f4e1bd434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(radexreader) python311-radexreader python3dist(radexreader)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-pyserial python311-pyusb update-alternatives"

inherit rpm
