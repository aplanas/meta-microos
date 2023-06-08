SUMMARY = "Ambiance Gtk Theme -- Common Files"
DESCRIPTION = "Includes an Ambiance light-on-dark theme. \
 \
Introduced as the default theme in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "metatheme-ambiance-common-20.10-2.2.noarch.rpm"
RPM_HASH = "021f93066eb03357e54430eeefa5a153cecd34e52616afe657814ff63e82c81c0fc3441911d0b02f12efc5cd7966ee87d7e013107491ef5117c22729a3c719b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-ambiance-common"
RDEPENDS:${PN} += ""

inherit rpm
