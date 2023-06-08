SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcoreaddons-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "312994fa3772061cd8e05535001d28a6915f643c25e3927319edb283c779d86c37738d82739cfab3f180d463b27141d7208ac5903ba01d1138cf8ba8bc4f283c"

RPROVIDES:${PN} += "kcoreaddons kcoreaddons(aarch-64)"
RDEPENDS:${PN} += "shared-mime-info"

inherit rpm
