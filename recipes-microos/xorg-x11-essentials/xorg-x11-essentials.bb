SUMMARY = "Compatibility metapackage for X.Org core applications"
DESCRIPTION = "This package is a compatibility metapackage. It requires the \
X.Org core applications packages."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-essentials-7.6_1-16.16.noarch.rpm"
RPM_HASH = "af304692ccb2db1b63fe96525b49a06904bec2a4562179b5fe8a20781b6fbe957fa76f21a146080290fafb59c382222489be36d02531d4a7cccfea22b9e1b790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-essentials"
RDEPENDS:${PN} += "iceauth \
mkfontdir \
mkfontscale \
rgb \
sessreg \
setxkbmap \
xauth \
xconsole \
xdm \
xinit \
xkbcomp \
xmessage \
xmodmap \
xprop \
xrdb \
xset \
xsetroot"

inherit rpm
