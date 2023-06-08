SUMMARY = "Text Progressbar Library for Python"
DESCRIPTION = "This library provides a text mode progressbar. This is tipically used to \
display the progress of a long running operation, providing a visual clue that \
processing is underway."
LICENSE = "LGPL-2.1-or-later | BSD-3-Clause"

PV = "2.5"

RPM_NAME = "python311-progressbar-2.5-2.17.noarch.rpm"
RPM_HASH = "6da719efe5fbd2832b5f336bb909f4605fdcc4a593ceeb66352bba523670ae9f7e5d2d9fd56411c7d3de759daa4faf921726ac3c404a0a479d7c43be55931027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(progressbar) python311-progressbar python3dist(progressbar)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
