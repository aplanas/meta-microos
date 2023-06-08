SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-local-db-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "a218b0ed8c32dab8990437278da957e857dc86ccc14a004d910c2df6cddcd09407eef7ad33e5e2b8290e0799b9ea8ff1ca028b2c5e802f76766a7c10cbe1d8ee"

RPROVIDES:${PN} += "openQA-local-db openQA-local-db(aarch-64)"
RDEPENDS:${PN} += "/bin/sh openQA postgresql-server"

inherit rpm
