SUMMARY = "Colored terminal output for Python's logging module"
DESCRIPTION = "The `coloredlogs` package enables colored terminal output for Python's logging_ \
module. The ColoredFormatter_ class inherits from `logging.Formatter`_ and uses \
`ANSI escape sequences`_ to render your logging messages in color. It uses only \
standard colors so it should work on any UNIX terminal. It's currently tested \
on Python 2.6, 2.7, 3.4, 3.5 and PyPy. On Windows `coloredlogs` automatically \
pulls in Colorama_ as a dependency and enables ANSI escape sequence translation \
using Colorama."
LICENSE = "MIT"

PV = "15.0.1"

RPM_NAME = "python311-coloredlogs-15.0.1-4.1.noarch.rpm"
RPM_HASH = "7fbdaa735e2c35d36cd1f65db6b18d9d55e42ebf7e1c237b53919b0ba092a40a77de6a695b41d97fb97500f9a81eb6754dbb36eec3efd32851ff371539dcebd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(coloredlogs) python311-coloredlogs python3dist(coloredlogs)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-capturer python311-humanfriendly update-alternatives"

inherit rpm
