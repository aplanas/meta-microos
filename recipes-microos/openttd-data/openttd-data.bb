SUMMARY = "OpenTTD data"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the data files needed by openttd or openttd-dedicated."
LICENSE = "GPL-2.0-only"

PV = "13.1"

RPM_NAME = "openttd-data-13.1-1.1.noarch.rpm"
RPM_HASH = "3a8db1a62faa165c438fb94da96a8450e0b95ca2dd37baf724375e10949c077dd54e9f6aaf64ee93080685c1cc510de4d6e082c15c7619106263ab1b1bc622b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openttd-data"
RDEPENDS:${PN} += ""

inherit rpm
