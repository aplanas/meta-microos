SUMMARY = "Digital TV guide"
DESCRIPTION = "TV-Browser is Plugin based digital TV guide. Plugins can be installed with \
the download function of TV-Browser."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.7"

RPM_NAME = "tvbrowser-4.2.7-1.2.noarch.rpm"
RPM_HASH = "d39256efa700bdb5af86e8417b6d4bf1d35135a8502a65ad1981d7b114fb142260d8aeb9995d78ae9b53c107678a8d1fcaa45bcd6e65f793dbee55e526028c46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(tvbrowser.desktop) \
metainfo() \
metainfo(tvbrowser.appdata.xml) \
tvbrowser"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
java"

inherit rpm
