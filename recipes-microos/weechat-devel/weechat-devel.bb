SUMMARY = "Development Environment for weechat Plugins"
DESCRIPTION = "Development environment for authoring weechat plugins."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-devel-3.8-1.1.aarch64.rpm"
RPM_HASH = "3a455d5aa1b99808eaffa493957caa2343e3030ab038590849aad34faa0b5f15a35f287141d4fcba155507a49f070dd430c95609aa49371376bfe76bd0746a68"

RPROVIDES:${PN} += "pkgconfig(weechat) weechat-devel weechat-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config weechat"

inherit rpm
