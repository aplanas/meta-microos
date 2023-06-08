SUMMARY = "Town stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-town package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-town-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "aafb75b28e991b5e2637cf463049e94e95a0971b848cf93efb6c897f54c86c3a38fd61084d6d1268928fea9b2269afc2c952491692605f2def39adcdfb565585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category tuxpaint-stamps-town"
RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
