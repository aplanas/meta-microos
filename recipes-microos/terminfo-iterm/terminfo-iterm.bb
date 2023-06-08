SUMMARY = "A terminal descriptions database for iterm"
DESCRIPTION = "This package includes some useful entries for the iterm utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "terminfo-iterm-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "b5c3b2294f756ed1391b3e44b80f676fe7c0add39fc3b9fd614be942f96d0d63fbd037c3103ea04ba1802a37d394e077610b8c8ce7e644de773d397914076782"

RPROVIDES:${PN} += "terminfo-iterm terminfo-iterm(aarch-64) terminfo:/usr/share/terminfo/i/iTerm.app"
RDEPENDS:${PN} += "terminfo-base"

inherit rpm
