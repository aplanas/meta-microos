SUMMARY = "A ligatured font for the Old Hungarian script"
DESCRIPTION = "Kende is a ligatured font for the Old Hungarian script."
LICENSE = "OFL-1.1"

PV = "20221015"

RPM_NAME = "rovasiras-kende-fonts-20221015-1.1.noarch.rpm"
RPM_HASH = "5c55a30ba09c2f4d63e818ba5dfb59f243d0a186ccbc6e8c7dff671fd5ef909278d6ab0dfac51e350d153ba47c2c68c346245bc13c8c5aef102e3228f9b229a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rovasiras-kende-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
