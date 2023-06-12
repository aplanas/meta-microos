SUMMARY = "LXDE Desktop Environment"
DESCRIPTION = "LXDE is a lightweight X11 desktop environment similiar to XFCE in its nature."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-lxde-lxde-20170319-3.5.aarch64.rpm"
RPM_HASH = "2027552d628842ae0b290dc7b0ecc249872be22f7a75687264a6c3887a6fd0637ae48badbdb48e4015669c4f20b9910c62bb35db3956e5312bc6e85be25bbf9d"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-lxde-lxde \
patterns-lxde-lxde(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
