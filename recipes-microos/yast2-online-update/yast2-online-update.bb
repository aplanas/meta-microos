SUMMARY = "YaST2 - Online Update (YOU)"
DESCRIPTION = "YaST Online Update (YOU) provides a convenient way to download and \
install security and other system updates. By default it uses the \
official SUSE mirrors as the update sources, but it can also use local \
patch repositories or patch CDs. \
 \
This package provides the graphical user interface for YOU which can be \
used with or without the X Window System. It can be started from the \
YaST control center."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-online-update-4.6.1-1.1.noarch.rpm"
RPM_HASH = "861280a4ec1fe97fe0c705cd1e719945646845d6bcb46334dec697cdbe0fcc78efeda74e91f79e4162e9d244059f4425d90fa72e70f269abce031a8f8a9f91b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "y2c_online_update y2t_online_update yast2-config-online-update yast2-online-update yast2-trans-online-update"
RDEPENDS:${PN} += "yast2 yast2-packager yast2-pkg-bindings yast2-ruby-bindings"

inherit rpm
