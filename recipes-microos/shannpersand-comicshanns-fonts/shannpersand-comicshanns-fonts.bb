SUMMARY = "Sans-serif casual script typeface"
DESCRIPTION = "Comic Shanns is a sans-serif casual script typeface inspired by Comic \
Sans (MS). Comic Shanns has slightly better weight management, and \
the issue of letterfit is not as much a concern in a monospace \
setting anyway."
LICENSE = "MIT"

PV = "2"

RPM_NAME = "shannpersand-comicshanns-fonts-2-1.3.noarch.rpm"
RPM_HASH = "7bcd6fddabbd9b36a58a87eb917b8da933be89cdbedaf1987c98c265c88911c82422087d3ce98b29363880fa140a840cf137be433b340c6f653ac2bd105b04fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shannpersand-comicshanns-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
