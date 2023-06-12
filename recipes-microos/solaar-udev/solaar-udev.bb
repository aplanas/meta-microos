SUMMARY = "Udev rules for accessing Logitech Unifying Receiver"
DESCRIPTION = "Rules that users are able to access Logitech Unifying Receiver."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.9"

RPM_NAME = "solaar-udev-1.1.9-1.1.noarch.rpm"
RPM_HASH = "9002f83fbf09361c8409b702c554cf2cff634ede1012f5ffdf2b17b667dc81d84c0a434eb0037d657a47bc8a3a53d62426dc797ef302bd1bfcae8be8e5c56198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solaar-udev"
RDEPENDS:${PN} += "/bin/sh \
udev"

inherit rpm
