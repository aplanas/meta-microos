SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python311-flask-restx-0.5.1-5.4.noarch.rpm"
RPM_HASH = "5867cbdfc243668110bfbd670c68d9298f90e4bd85b0a0b2f1d65333463c608ede5570c77c3b7061d8ff97349b0e00dfa6baaa120e0cd42aceeb10566edeed34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-restx) python311-flask-restx python3dist(flask-restx)"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-aniso8601 python311-jsonschema python311-pytz"

inherit rpm
