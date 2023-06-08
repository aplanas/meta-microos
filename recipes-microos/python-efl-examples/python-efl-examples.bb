SUMMARY = "Examples of python-efl usage"
DESCRIPTION = "Some examples of usage of python-efl."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.25.0"

RPM_NAME = "python-efl-examples-1.25.0-2.6.aarch64.rpm"
RPM_HASH = "309362565e920b691112ef37e7025482b6ec8c73ebef88371945d67dcb271c999e82697748f62efebd16c27ad6a123ea3224551aca199794b7af5c2cda3210f4"

RPROVIDES:${PN} += "python-efl-examples python-efl-examples(aarch-64) python3-efl-examples"
RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
