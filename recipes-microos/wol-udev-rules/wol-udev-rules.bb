SUMMARY = "Udev rules for activate wol via a magic packet on ethernet devices"
DESCRIPTION = "This package contains the udev rule file for configuring ethernet devices for activate wol via a magic packet."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "wol-udev-rules-0.7.1-162.20.noarch.rpm"
RPM_HASH = "cbc284c0fd1e1afc0a34bf7531c2987ef8b91e95d9fa54d437685b6bce80bdb80f25d097993b60da3edcd078799ae832cb0183c747a0d526718d2db0c63f76fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wol-udev-rules"
RDEPENDS:${PN} += "ethtool udev"

inherit rpm
