SUMMARY = "MATE Weather common files"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "mateweather-common-1.26.0-1.9.noarch.rpm"
RPM_HASH = "c70265953012caebff1e78d88491de35d537ab2eb3a858fc07469ce02e6a6c47ef037a6e8e073fa5d3257507e28c5a8e7b3e0959d92c7ba357c93be906f605f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mateweather-common"
RDEPENDS:${PN} += ""

inherit rpm
