SUMMARY = "SUSE PolicyKit default permissions"
DESCRIPTION = "Predefined polkit profiles for different usage scenarios like desktop and \
server. These profiles define the kind of authentication required for various \
polkit actions used across applications."
LICENSE = "GPL-2.0-or-later"

PV = "1550+20230307.7f42172"

RPM_NAME = "polkit-default-privs-1550+20230307.7f42172-1.1.noarch.rpm"
RPM_HASH = "420ca3bbe5469dec0c40e35a4acf06615dc0b7d426910b5f10cdf12853ff1557d9064ec240a8ffc26164b88e9066b7fe3637a32c0bebf00093ad70429b9f0f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polkit-default-privs"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch fillup polkit"

inherit rpm
