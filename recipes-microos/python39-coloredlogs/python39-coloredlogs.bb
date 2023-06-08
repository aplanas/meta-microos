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

RPM_NAME = "python39-coloredlogs-15.0.1-4.1.noarch.rpm"
RPM_HASH = "33ad514dc4544f247de7a950ade69cf49bc25a637142820841728c7a00a8114cdd1076b1faf400849568780292544ca9e9cf530b45888957da97010bef69000a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(coloredlogs) python39-coloredlogs python3dist(coloredlogs)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-capturer python39-humanfriendly update-alternatives"

inherit rpm
