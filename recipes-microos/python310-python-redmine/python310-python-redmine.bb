SUMMARY = "Python library for the Redmine RESTful API"
DESCRIPTION = "Python Redmine is a library for communicating with a Redmine \
project management application. Redmine exposes some of it's data \
via REST API for which Python Redmine provides a simple but \
powerful Pythonic API inspired by a well-known Django ORM."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python310-python-redmine-2.4.0-1.3.noarch.rpm"
RPM_HASH = "df8e38808a3f87feea2116b38b2ff6ddbb67f525fb301ec6627df87eeb80bb0afc870ed184a44e0255acc490d67f58daba22ed23616ebc855773399d533aea39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-redmine python3.10dist(python-redmine) python310-python-redmine python3dist(python-redmine)"
RDEPENDS:${PN} += "python(abi) python310-requests"

inherit rpm
