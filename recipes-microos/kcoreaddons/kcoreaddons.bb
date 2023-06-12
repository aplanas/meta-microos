SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcoreaddons-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f2e85eb57d81165cc7969cbb48ef3704709290b00e9d9abebd229741aa529acda621b04557437fd834f735722f13c3bcddcb8707f230ecdb0b8c1c7eb459a0bd"

RPROVIDES:${PN} += "kcoreaddons kcoreaddons(aarch-64)"
RDEPENDS:${PN} += "shared-mime-info"

inherit rpm
