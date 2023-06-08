SUMMARY = "SubRip (.srt) subtitle parser and writer"
DESCRIPTION = "pysrt is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "python39-pysrt-1.1.2-3.14.noarch.rpm"
RPM_HASH = "1465abaa04609e80b9892e391a5852fb80cc967b05a42cbee18213392b3e3099ae1436fc39c23975714a3fe8653d3d2905f44b70dbc83615e547dbf18ca21467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pysrt) python39-pysrt python3dist(pysrt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-chardet update-alternatives"

inherit rpm
