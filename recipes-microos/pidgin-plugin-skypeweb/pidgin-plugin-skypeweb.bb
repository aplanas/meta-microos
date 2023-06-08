SUMMARY = "Pidgin plugin for SkypeWeb API"
DESCRIPTION = "This is a SkypeWeb Plugin for Pidgin. It lets you view and chat \
with all your Skype buddies from within Pidgin."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "pidgin-plugin-skypeweb-1.7-1.3.aarch64.rpm"
RPM_HASH = "358df9682c693353dfb972db67fbe28601437d68b87232beb4920662a154c8dc14c82fea4a4dfeb5b80ba56b71f199f06573dd36c36fa30d816989d23aa098eb"

RPROVIDES:${PN} += "pidgin-plugin-skypeweb pidgin-plugin-skypeweb(aarch-64)"
RDEPENDS:${PN} += "libpurple-plugin-skypeweb pidgin"

inherit rpm
