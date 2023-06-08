SUMMARY = "Text Progressbar Library for Python"
DESCRIPTION = "This library provides a text mode progressbar. This is tipically used to \
display the progress of a long running operation, providing a visual clue that \
processing is underway."
LICENSE = "LGPL-2.1-or-later | BSD-3-Clause"

PV = "2.5"

RPM_NAME = "python310-progressbar-2.5-2.17.noarch.rpm"
RPM_HASH = "515c4500f6ecffdd42d5fe72b086cb6a72941ebb2c6cf1622a572dc86576ff34390d8d5623456af9881af333a604354f0998132da28a99d6b22c7a6032e24ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progressbar python3.10dist(progressbar) python310-progressbar python3dist(progressbar)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
