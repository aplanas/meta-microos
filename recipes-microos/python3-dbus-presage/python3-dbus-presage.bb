SUMMARY = "Intelligent predictive text entry platform (dbus service)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the presage D-Bus service. \
 \
This package also contains a simple demonstration program that uses the D-Bus service."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-dbus-presage-0.9.1-12.10.aarch64.rpm"
RPM_HASH = "0fbd2f4bc57d28687dba9193a1e47b213600a82ff1ad3d19fb8045fc82ad3ab8222208d916aa9391cc66f911d52f25a5566f83215529899a3c161df2c7eeb351"

RPROVIDES:${PN} += "dbus-1-presage python3-dbus-presage python3-dbus-presage(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-dbus-python python3-presage"

inherit rpm
